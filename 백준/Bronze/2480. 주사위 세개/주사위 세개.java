import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int A=Integer.parseInt(st.nextToken()); 
			int B=Integer.parseInt(st.nextToken()); 
			int C=Integer.parseInt(st.nextToken()); 
		
			if(A==B&&B==C) {
				System.out.println(A*1000+10000);
			}else if((A==B)||(A==C)) {
				System.out.println(A*100+1000);
			}else if(B==C) {
				System.out.println(B*100+1000);
			}else {
				int res=Math.max(Math.max(A, B),C);
				System.out.println(res*100);
			}
		}


}
