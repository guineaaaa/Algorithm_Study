import java.util.Scanner;


public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int[] arr=new int[9];
			
			for(int i=0;i<9;i++) {
				arr[i]=sc.nextInt();
			}
			
			int max=arr[0], maxIdx=0;
			for(int i=0;i<9;i++) {
				if(arr[i]>max) {
					max=arr[i];
					maxIdx=i;
				}
			}
            
            maxIdx+=1;
			
			System.out.println(max);
			System.out.println(maxIdx);
		}
		
		
}
