
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			// 1 ≤ A, B, C ≤ 10^12)
			// int: -32768~+36767
			// long: -2,147,486,648 ~ +2,147,483,647
			long A=Long.parseLong(st.nextToken());
			long B=Long.parseLong(st.nextToken());
			long C=Long.parseLong(st.nextToken());
			
			System.out.println(A+B+C);
		}	

}
