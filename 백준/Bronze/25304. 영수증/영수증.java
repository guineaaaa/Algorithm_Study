

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
	        long X = Long.parseLong(br.readLine()); // 총 금액
	        int N = Integer.parseInt(br.readLine()); // 물건의 종류 수
			
			long sum=0;
			
			for(int i=0;i<N;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				short b=Short.parseShort(st.nextToken());
				sum+=a*b;
			}
			
			if(sum==X) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		


}
