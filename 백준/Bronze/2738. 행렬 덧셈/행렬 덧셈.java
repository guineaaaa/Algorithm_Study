
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			// N, M 입력 받음
			StringTokenizer st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			
			int[][] A=new int[N][M];
			int[][] B=new int[N][M];
			int[][] res=new int[N][M];
			
			// 행렬 A 원소 입력 받기
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<M;j++) {
					A[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			// 행렬 B 원소 입력 받기
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<M;j++) {
					B[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			StringBuilder sb=new StringBuilder();
			// A + B
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					res[i][j]=A[i][j]+B[i][j];
					sb.append(res[i][j]).append(" ");
				}
				sb.append("\n");
			}
			
			
			System.out.println(sb.toString());
			
		}
		
		
}
