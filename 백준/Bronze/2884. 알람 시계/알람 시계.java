import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int H=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());

			if(M>=45) {
				M=M-45;
				System.out.println(H+" "+M);
			}else {
				H=H-1;
				M=M+60-45;
				if(H<0) {H=23;}
				System.out.println(H+" "+M);
			}
		}

}