
import java.util.Scanner;


public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			boolean[] res=new boolean[42];
			
			int[] arr=new int[10];
			
			int n,count=0;
			for(int i=0;i<10;i++) {
				arr[i]=sc.nextInt();
				n=arr[i]%42;
				res[n]=true;
			}
			
			for(int i=0;i<42;i++) {
				if(res[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
}
