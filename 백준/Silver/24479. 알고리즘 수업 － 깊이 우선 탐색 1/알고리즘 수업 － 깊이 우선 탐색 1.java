import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	static int[] visitedOrder;
	static int order=1;
	/**
	 * 1. DFS를 시작할 노드를 정하고 사용할 자료구조 초기화
	 * 2. 스택에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 스택에 삽입
	 * 3. 스택에 값이 없을 때 까지 반복
	 */
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정점 수 N, 간선 수 M, 시작 정점 R
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int R=Integer.parseInt(st.nextToken());
        
        A=new ArrayList[N+1];
        visited=new boolean[N+1];
        visitedOrder=new int[N+1];
        
        // 인접 리스트 초기화 하기
        for(int i=1;i<=N;i++) {
        	A[i]=new ArrayList<Integer>();
        }
        
        // 간선 정보 -  정점 u와 정점 v의 가중치 1인 양방향 간선
        for(int i=0;i<M;i++) {
        	st=new StringTokenizer(br.readLine());
        	int u=Integer.parseInt(st.nextToken());
        	int v=Integer.parseInt(st.nextToken());
        	A[u].add(v); //양방향 edge
        	A[v].add(u);
        }
        
        // 정점 방문 순서를 보장하기 위한 정렬
        for(int i=1;i<=N;i++) {
        	Collections.sort(A[i]);
        }
       
        // 시작 정점 R에서 DFS 시작
        DFS(R);
        
        // 각 정점의 방문 순서 출력
        for(int i=1;i<=N;i++) {
        	bw.write(visitedOrder[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    
    static void DFS(int v) {
    	if (visited[v]) return;
    	visited[v]=true;
    	visitedOrder[v]=order++;
    	
    	for(int i: A[v]) {
    		// 연결 노드들 중 방문하지 않았던 노드만 탐색
    		if(visited[i]==false) {
    			DFS(i);
    		}
    	}
    }
    
    
}
