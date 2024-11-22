import java.io.IOException;
import java.util.Scanner;


public class Main {
		public static void main(String[] args)throws IOException{
			Scanner sc=new Scanner(System.in);
			
			int num1=sc.nextInt();
			String num2=sc.next();
			
			int a=num2.charAt(2)-'0';
			int b=num2.charAt(1)-'0';
			int c=num2.charAt(0)-'0';
			int d=Integer.parseInt(num2);
			
			System.out.println(num1*a);
			System.out.println(num1*b);
			System.out.println(num1*c);
			System.out.println(num1*d);
		
			sc.close();
		}	

}
