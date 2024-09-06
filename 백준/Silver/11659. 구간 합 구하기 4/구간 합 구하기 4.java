import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine());
		
		// 데이터의 개수
		int dataNo=Integer.parseInt(stringTokenizer.nextToken());
		
		// 질의 개수
		int quizNo=Integer.parseInt(stringTokenizer.nextToken());
		
		// 합 배열 생성
		long S[]=new long[dataNo+1]; //0번 인덱스는 무시하고 1번 인덱스부터 시작한다.
		
		// 1. 입력받음과 동시에 합배열 생성
		stringTokenizer=new StringTokenizer(bufferedReader.readLine());
		for(int i=1;i<=dataNo;i++) {
			S[i]=S[i-1]+Integer.parseInt(stringTokenizer.nextToken());
		}
		
		// 2. 질의범위 입력받고 구간합 계산하기
		for(int k=0;k<quizNo;k++) {
			stringTokenizer=new StringTokenizer(bufferedReader.readLine());
			int i=Integer.parseInt(stringTokenizer.nextToken());
			int j=Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
	}

}
