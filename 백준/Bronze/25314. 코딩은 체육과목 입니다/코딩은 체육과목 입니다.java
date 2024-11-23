
import java.util.Scanner;


public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			int N=sc.nextInt();
			int n=0;
			
			StringBuilder sb=new StringBuilder();
			
			if(N%4==0) {
				n=N/4;
				for(int i=0;i<n;i++) {
					sb.append("long ");
				}
				sb.append("int");
			}
			
			System.out.println(sb.toString().trim());
			
		}
		


}