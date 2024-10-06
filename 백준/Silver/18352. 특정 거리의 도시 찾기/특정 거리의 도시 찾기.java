
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main { //특정 거리 도시 찾기
	static int visited[]; // 방문 거리 저장 배열
	static ArrayList<Integer>[]A; //A (그래프 데이터 저장 인접 리스트)
	static int N,M,K,X; //N: 노드 개수, M: 엣지 개수, K:목표 거리, X:시작점
	static List<Integer> answer; // 정답 리스트

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// 입력받기: 노드 수, 엣지 수, 목표 거리, 시작점을 입력받음
		N=sc.nextInt(); //노드의 수
		M=sc.nextInt(); //엣지 개수
		K=sc.nextInt(); //목표 거리
		X=sc.nextInt(); //시작점
		
		// 인접 리스트 배열을 초기화 (1번 노드부터 사용하기에 N+1로 배열 크기 설정)
		A=new ArrayList[N+1]; 
		
		// 결과 리스트 초기화
		answer=new ArrayList<>();
		
		// N의 개수만큼 반복해, A의 인접 리스트의 각 ArrayList 초기화
		for(int i=1;i<=N;i++) {
			A[i]=new ArrayList<Integer>();
		}
		
		// M개의 엣지에 대한 정보를 입력받는다.
		for(int i=0;i<M;i++) { 
			int S=sc.nextInt(); // 출발점 S
			int E=sc.nextInt(); // 도착점 E
			A[S].add(E); // 인접 리스트에 연결 정보 저장 
		}
		
		//방문 배열 초기화하기 (-1로 초기화하여 아직 방문하지 않았음을 표시)
		visited=new int[N+1]; 
		for(int i=0;i<=N;i++) {
			visited[i]=-1;
		}
		
		BFS(X); //BFS 실행해서 X에서 목표거리 K에 있는 도시 찾기
		
		for(int i=0;i<=N;i++) { // 방문거리가 K인 노드의 숫자를 정답 배열에 더하기
			if(visited[i]==K) {answer.add(i);}
		}
		
		// 결과가 없다면 -1 출력하고, 있다면 오름차순으로 정렬해 출력
		if(answer.isEmpty()) {System.out.println("-1");}
		else {Collections.sort(answer);}
		
		// 결과 출력하기
		for(int temp:answer) {System.out.println(temp);}

	}
	
	// BFS 구현
	private static void BFS(int Node) {
		Queue<Integer> queue=new LinkedList<Integer>();
		
		queue.add(Node); //큐 자료구조에 출발 노드 더하기
		visited[Node]++; // visited 배열에 현재 노드 방문 기록하기
		
		while(!queue.isEmpty()) { // 큐가 빌 때 까지
			int now_Node=queue.poll(); //큐에서 노드 데이터 가져오기 poll()
			
			for(int i:A[now_Node]) { //큐에 데이터 삽입 연산하고, visited 배열에 방문 거리 기록하기
				if(visited[i]==-1) { // 아직 방문하지 않은 노드라면
					visited[i]=visited[now_Node]+1; // 현재 노드에서 한단계 이동했으므로 _1
					queue.add(i); // 해당 노드를 큐에 추가하기
				}

			}
		}
	}

}
