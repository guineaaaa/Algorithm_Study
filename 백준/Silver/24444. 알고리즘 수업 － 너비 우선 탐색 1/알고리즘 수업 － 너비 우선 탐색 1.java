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
	
	/**
	 * 1. BFS를 시작할 노드를 정하고 사용할 자료구조 초기화
	 * 2. 큐에서 노드를 꺼낸 후 꺼낸 큐의 인접 노드를 큐에 삽입
	 * 3. 아직 방문하지 않은 노드들을 큐에 삽입하고 방문 순서를 기록
	 * 4. 큐에 값이 없을 때 까지 반복
	 */
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	int N=Integer.parseInt(st.nextToken()); // 정점의 수 N
    	int M=Integer.parseInt(st.nextToken()); // 간선의 수 M
    	int R=Integer.parseInt(st.nextToken()); // 시작 정점 R
    	
    	A=new ArrayList[N+1];
    	visited=new boolean[N+1];
    	visitedOrder=new int[N+1];
    	
    	// 인접 리스트 초기화
    	for(int i=1;i<=N;i++) {
    		A[i]=new ArrayList<Integer>();
    	}
    	
    	// 간선 정보 삽입 (양방향 간선)
    	for(int i=1;i<=M;i++) {
    		StringTokenizer st1=new StringTokenizer(br.readLine());
    		int u=Integer.parseInt(st1.nextToken());
    		int v=Integer.parseInt(st1.nextToken());
    		A[u].add(v);
    		A[v].add(u);
    	}
    	
    	// 오름차순 방문을 위한 정렬
    	for(int i=1;i<=N;i++) {
    		Collections.sort(A[i]);
    	}
    	
    	BFS(R);
    	
    	// 방문 순서 출력
    	for(int i=1;i<=N;i++) {
    		bw.write(visitedOrder[i]+"\n");
    	}
    	
    	bw.flush();
    	bw.close();
    	
    }
    
    /**
     * 1. 시작 정점을 삽입 후 큐에 표시
     * 2. 큐에서 poll()을 한 후 해당 노드의 인접&방문 X 노드 탐색
     * 3. 큐에 노드가 없을 때 까지 반복하기
     */
    static void BFS(int v) {
    	Queue<Integer> queue=new LinkedList<>();
    	if(visited[v]) {return;}
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
