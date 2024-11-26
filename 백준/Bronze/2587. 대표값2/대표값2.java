import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[5];
			
			for(int i=0;i<5;i++) {
				arr[i]=sc.nextInt();
			}
			
			int sum=0,avg=0, center=0;
			
			for(int i=0;i<5;i++) {
				sum+=arr[i];
			}
			avg=sum/5;
			
			Arrays.sort(arr);
			center=arr[2];
			
			System.out.println(avg+" "+center);
			
            sc.close();
		}
		
		
}