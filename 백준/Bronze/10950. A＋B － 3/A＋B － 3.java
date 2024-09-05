import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int arr[]=new int[N];
		int a=0,b=0;
		
		for(int i=0;i<N;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			
			arr[i]=a+b;
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}

	}

}
