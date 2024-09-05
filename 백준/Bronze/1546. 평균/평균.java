import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int score[]=new int[N];
		
		for(int i=0;i<N;i++) {
			score[i]=sc.nextInt();
		}
		
		long max=0,sum=0;
		
		for(int i=0;i<N;i++) {
			if(score[i]>max) {
				max=score[i];
			}
			sum+=score[i];
		}
		
		double newAvg=(100.0*sum/max/N);
		System.out.print(newAvg);
	}

}
