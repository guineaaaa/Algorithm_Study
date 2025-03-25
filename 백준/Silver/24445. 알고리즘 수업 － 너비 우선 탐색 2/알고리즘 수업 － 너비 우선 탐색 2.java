import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	static int visitedOrder[];
	static int order=1;
	
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	int N=Integer.parseInt(st.nextToken()); // 정점 수 N
    	int M=Integer.parseInt(st.nextToken()); // 간선 수 M
    	int R=Integer.parseInt(st.nextToken()); // 시작 정점 R
    	
    	A=new ArrayList[N+1];
    	visited=new boolean[N+1];
    	visitedOrder=new int[N+1];
    	
    	for(int i=1;i<=N;i++) {
    		A[i]=new ArrayList<Integer>();
    	}
    	
    	for(int i=1;i<=M;i++) {
    		StringTokenizer st1=new StringTokenizer(br.readLine());
    		int u=Integer.parseInt(st1.nextToken());
    		int v=Integer.parseInt(st1.nextToken());
    		A[u].add(v);
    		A[v].add(u);
    	}
    	
    	// 내림차순 정렬
    	for(int i=1;i<=N;i++) {
    		Collections.sort(A[i], Collections.reverseOrder());
    	}
    	
    	BFS(R);
    	
    	for(int i=1;i<=N;i++) {
    		bw.write(visitedOrder[i]+"\n");
    	}
    	
    	bw.flush();
    	bw.close();
    }
    
   
    static void BFS(int v) {
    	Queue<Integer> queue=new LinkedList<>();
    	visited[v]=true;
    	visitedOrder[v]=order++;
    	
    	queue.add(v);
    	while(!queue.isEmpty()) {
    		int node=queue.poll();
    		
    		// 인접 노드 탐색
    		for(int i:A[node]) {
    			if(!visited[i]) {
    				visited[i]=true;
    				visitedOrder[i]=order++;
    				queue.add(i);
    			}
    		}
    	}
    	
    	
    }
   
    	
    
}
