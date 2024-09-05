import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=0, sum=0;
		String sNum;
		char cNum[];
		
		N=sc.nextInt();
		
		// 입력값을 String형 변수 sNum에 저장한 후, char[]형 변수로 변환하기
		sNum=sc.next();
		
		cNum=sNum.toCharArray();
		for(int i=0;i<cNum.length;i++) {
			sum+=cNum[i]-'0'; //cNum[i]를 정수형 변수로 변환하면서 sum에 값을 누적하기
		}
		
		System.out.print(sum);
	}

}