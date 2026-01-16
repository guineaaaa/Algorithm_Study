import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] arr;
	static boolean[] visited;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		arr=new int[M];
		visited=new boolean[N+1];
		
		dfs(0);
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 1~N에서 중복 없이 M개를 뽑아 순서 있는 수열 전부 만들기 
	static void dfs(int depth) throws IOException{
		if(depth==M) {
			for(int i=0;i<M;i++) {
				bw.write(arr[i]+(i==M-1?"":" "));
			}
			bw.newLine();
			return;
		}
		
		for(int i=1;i<=N;i++) { //1부터 N까지 숫자 순서대로 시도 
			if(visited[i]) continue;
			
			visited[i]=true; // i 사용함
			arr[depth]=i; // 현재 depth 자리에 i를 넣어 수열 확장
			dfs(depth+1); // 다음 자리를 채우기 위해 재귀 호출
			visited[i]=false; // 재귀가 끝나면 i 사용 표시 되돌림 (백트래킹)
		}
	}
	
}
