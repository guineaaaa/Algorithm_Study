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
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine()); // 컴퓨터들의 수
    	int M=Integer.parseInt(br.readLine()); // 네트워크에서 연결된 수
    	
    	A=new ArrayList[N+1];
    	visited=new boolean[N+1];
    	
    	for(int i=1;i<=N;i++) {
    		A[i]=new ArrayList<>();
    	}
    	
    	// 직접 연결되어 있는 컴퓨터 번호 쌍 입력받기
    	for(int i=1;i<=M;i++) {
    		StringTokenizer st=new StringTokenizer(br.readLine());
    		int u=Integer.parseInt(st.nextToken());
    		int v=Integer.parseInt(st.nextToken());
    		A[u].add(v);
    		A[v].add(u);
    	}
    	
    	// 인접 노드들을 정렬한다
    	for(int i=1;i<=N;i++) {
    		Collections.sort(A[i]);
    	}
    	
    	BFS(1);
    	
    	int count=0;
    	// 1번 컴퓨터에 의해 웜바이러스가 걸리는 컴퓨터들의 수
    	for(int i=1;i<=N;i++) {
    		if(visited[i]) {
    			count++;
    		}
    	}
    	
    	// 1번 노드는 제외
    	bw.write(String.valueOf(count-1));
    	bw.flush();
    	bw.close();
    }
   
    static void BFS(int v) {
    	Queue<Integer> queue=new LinkedList<>();
    	visited[v]=true;
    	queue.add(v);
    	
    	while(!queue.isEmpty()) {
    		int node=queue.poll();
    		
    		// poll 된 노드의 인접 노드 순회
    		for(int i:A[node]) {
    			if(!visited[i]) {
    				visited[i]=true;
    				queue.add(i);
    			}
    		}
    	}
    	
    	
    }
    	
    
}
