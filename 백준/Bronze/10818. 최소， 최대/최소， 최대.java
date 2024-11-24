
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb=new StringBuilder();
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int N=Integer.parseInt(st.nextToken());
			
			int []A=new int[N];
			
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				A[i]=Integer.parseInt(st.nextToken());
			}
			
			int max=A[0];
			for(int i=0;i<N;i++) {
				if(A[i]>max) {
					max=A[i];
				}
			}
		
			int min=A[0];
			for(int i=0;i<N;i++) {
				if(A[i]<min) {
					min=A[i];
				}
			}
			
			sb.append(min).append(" ").append(max);
			System.out.println(sb.toString());
			
		}
		
		
}
