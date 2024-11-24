import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int N=Integer.parseInt(st.nextToken());
			int X=Integer.parseInt(st.nextToken());
			
			int []A=new int[N];
			
			StringBuilder sb=new StringBuilder();
			
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				A[i]=Integer.parseInt(st.nextToken());
				if(A[i]<X) {
					sb.append(A[i]).append(" ");
				}
			}
			System.out.println(sb.toString());
					
		}
		


}
