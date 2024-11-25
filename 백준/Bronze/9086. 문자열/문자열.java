import java.util.Scanner;


public class Main {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<n;i++) {
				String s=sc.next();
				sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
			}
			
			System.out.println(sb.toString());
		}
		
		
}
