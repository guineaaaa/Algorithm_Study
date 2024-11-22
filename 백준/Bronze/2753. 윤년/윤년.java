import java.io.IOException;
import java.util.Scanner;


public class Main {
		public static void main(String[] args)throws IOException{
			Scanner sc=new Scanner(System.in);
			
			int input=sc.nextInt();
			
	        // 윤년 판단: 4로 나누어지고 100으로 나누어지지 않거나, 400으로 나누어지면 윤년
	        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
	            System.out.println("1");  // 윤년
	        } else {
	            System.out.println("0");  // 윤년이 아님
	        }
		}	

}
