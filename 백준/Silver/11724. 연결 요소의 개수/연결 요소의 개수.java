import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken()); // 노드 개수
    	int M=Integer.parseInt(st.nextToken()); // 엣지 개수
    	
    	A=new ArrayList[N+1]; // 그래프 데이터 저장 인접 리스트
    	visited=new boolean[N+1]; // 방문 기록 저장 배열
    	
    	for(int i=1;i<N+1;i++) { //인접 리스트 초기화
    		A[i]=new ArrayList<Integer>();
    	}
    	
    	for(int i=0;i<M;i++) { // A 인접 리스트에 그래프 데이터 저장
    		st=new StringTokenizer(br.readLine());
    		int S=Integer.parseInt(st.nextToken());
    		int E=Integer.parseInt(st.nextToken());
    		
    		A[S].add(E); A[E].add(S); //양방향 엣지 이므로 양쪽에 엣지 더하기
    	}
    	int count=0;
    	
    	for(int i=1;i<N+1;i++) {
    		if(!visited[i]) { //방문 안한 노드가 없을 떄 까지 반복
    			count++; // 연결 요소 개수 
    			DFS(i); // DFS 실행
    			// 모든 노드를 탐색하는데 실행한 DFS 실행 횟수 = 연결 요소의 개수
    		}
    	}
    	bw.write(String.valueOf(count));
    	bw.flush(); 
    	bw.close();
    }    
    
    static void DFS(int v) {
    	if(visited[v]) {return;}
    	visited[v]=true;
    	
    	for(int i: A[v]) {
    		if(visited[i]==false) { //연결 노드들 중 방문하지 않았던 노드만 탐색
    			DFS(i);
    		}
    	}
    	
    }
}