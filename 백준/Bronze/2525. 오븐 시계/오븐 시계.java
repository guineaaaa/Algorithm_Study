import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int A=Integer.parseInt(st.nextToken()); //시
			int B=Integer.parseInt(st.nextToken()); //분
			
			st=new StringTokenizer(br.readLine());
			int C=Integer.parseInt(st.nextToken());
			
			// 분 계산하기
			B+=C;
			
			// 분이 60 이상일 경우
			if(B>=60) {
				A+=B/60;
				B%=60;
			}
			
			// 시가 24 이상이면 24시간 형식으로 변환하기
			if(A>=24) {
				A%=24;
			}
			
			System.out.println(A+" "+B);
			
		}


}