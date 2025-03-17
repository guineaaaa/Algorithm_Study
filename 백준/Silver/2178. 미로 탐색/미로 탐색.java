import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	// 상하좌우 탐색효과
	// x로 0만큼, y로 1만큼: 아래를 탐색해라 (하)
	// x로 1만큼, y로 0만큼: 오른쪽을 탐색해라 (우)
	// x로 0만큼, y로 -1만큼: 위를 탐색해라 (상)
	// x로 -1만큼, y로 0만큼: 왼쪽을 탐색해라 (좌)
	static int[] dx= {0,1,0,-1}; 
	static int[] dy= {1,0,-1,0};
	static boolean visited[][];
	static int[][] A;
	static int N, M;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st=new StringTokenizer(br.readLine());	
    	
    	N=Integer.parseInt(st.nextToken());
    	M=Integer.parseInt(st.nextToken());
    	A=new int[N][M];
    	visited=new boolean[N][M];
    	
    	for(int i=0;i<N;i++) {
    		st=new StringTokenizer(br.readLine());
    		String line=st.nextToken(); //101011101101
    		for(int j=0;j<M;j++) {
    			// 데이터를 하나하나씩 끊어서 숫자로끊어주는거임
    			A[i][j]=Integer.parseInt(line.substring(j,j+1));
    		}
    	}
    	
    	BFS(0,0);
    	bw.write(A[N-1][M-1]+"\n");
    	bw.flush();
    	bw.close();
    }
    /**
     * 1. 큐에 시작 위치 추가+방문 처리
     * 2. 큐에서 하나씩 꺼내 상하좌우 탐색
     * 3. 이동 가능하면 방문 처리 + 거리 기록 후 큐에 추가
     * 4. 큐가 빌 때 까지 반복
     */
    
    static void BFS(int i, int j) {
    	Queue<int[]> queue=new LinkedList<>(); //(x,y) 좌표를 저장하는 배열 큐
    	queue.offer(new int[] {i,j}); //처음 시작점을 넣어줌
    	visited[i][j]=true;
    	
    	while(!queue.isEmpty()) {
    		int now[]=queue.poll(); //현재 위치 가져오기
    		
    		// 상하좌우 탐색
    		for(int k=0;k<4;k++) {
    			int x=now[0]+dx[k];
    			int y=now[1]+dy[k];
    			
    			// 배열 인덱스를 넘어가면 안됨
    			if(x>=0 && y>=0 && x<N && y<M) {
    				// 0이여서 방문할 수 없거나 방문한 배열이면 안됨
    				if(A[x][y]!=0 && !visited[x][y]) {
    					// 이제 갈 수 있는 곳
    					visited[x][y]=true; // 방문 표시
    					A[x][y]=A[now[0]][now[1]]+1; // 현쟈 위치의 값+1 해서 다음 위치에 저장
    					queue.add(new int[] {x,y}); // 다음 탐색할 위치를 큐에 추가
    				}
    			}
    		}
    	}
    }
}
