
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] fibo=new int[46]; //N의 범위는 45까지 이므로 46인 int형 배열을 만든다.
		fibo[0]=0;
		fibo[1]=1;
		
		for(int i=2;i<fibo.length;i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		System.out.println(fibo[N]);
		
	}

}
