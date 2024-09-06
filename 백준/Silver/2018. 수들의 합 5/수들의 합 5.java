
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int count=1;
		
		// 시작 인덱스, 종료 인덱스를 투 포인터로 지정한 후 접근한다
		int start_index=1, end_index=1;
		int sum=1;
		
		while(end_index!=N) {
			if(sum==N) {
				count++;
				end_index++;
				sum+=end_index;
			}else if(sum>N) {
				sum-=start_index;
				start_index++;
			}else {
				end_index++;
				sum+=end_index;
			}
		}
		System.out.println(count);
	}

}
