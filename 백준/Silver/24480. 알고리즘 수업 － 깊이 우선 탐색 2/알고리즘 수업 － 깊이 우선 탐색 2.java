import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int[] visitedOrder;
	static int order=1;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken()); // 정점 집합
    	int M=Integer.parseInt(st.nextToken()); // 간선 집합
    	int R=Integer.parseInt(st.nextToken()); // 시작 정점
    	
    	A=new ArrayList[N+1];
    	visited=new boolean[N+1];
    	visitedOrder=new int[N+1];
    	
    	for(int i=1;i<=N;i++) {
    		A[i]=new ArrayList<>();
    	}
    	
    	for(int i=1;i<=M;i++) {
    		StringTokenizer st1=new StringTokenizer(br.readLine());
    		int u=Integer.parseInt(st1.nextToken());
    		int v=Integer.parseInt(st1.nextToken());
    		A[u].add(v); 
    		A[v].add(u);
    	}
    	
    	// 인접 정점을 내림차순으로 정렬하기
    	for(int i=1;i<=N;i++) {
    		Collections.sort(A[i], Collections.reverseOrder());
    	}
    	
    	DFS(R);
    	
    	for(int i=1;i<=N;i++) {
    		bw.write(visitedOrder[i]+"\n");
    	}
    	
    	bw.flush();
    	bw.close();
    }
    
    
    static void DFS(int v) {
    	if(visited[v]==true) return;
    	visited[v]=true;
    	visitedOrder[v]=order++;
    	
    	for(int i:A[v]) {
    		if(visited[i]==false) {
    			DFS(i);
    		}
    	}
    }
}
