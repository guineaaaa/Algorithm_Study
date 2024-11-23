
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb=new StringBuilder();
			
			int T=Integer.parseInt(br.readLine());
			
			for(int i=0;i<T;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				int A=Integer.parseInt(st.nextToken());
				int B=Integer.parseInt(st.nextToken());
				sb.append(A+B).append("\n");
			}
			
			System.out.println(sb.toString());
			/* System.out.println()을 반복 호출하는 것은 시간 초과원인
			for(int i=0;i<T;i++) {
				System.out.println(res[i]);
			}
			*/
			
			
			
		}
		


}
