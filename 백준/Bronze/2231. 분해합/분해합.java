import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	int result=0; //분해합 결과값을 저장할 변수
    	
    	for(int i=1;i<=N;i++) {
    		int sum=0; //각 자릿수의 합을 저장할 변수
    		int number=i;
    		
    		//자릿수의 합을 더함
    		while(number!=0) {
    			sum+=number%10; 
    			number/=10;
    		}
    		
    		// 분해합 N=X+(X의 자릿수합)
    		if(sum+i==N) {
    			result=i;
    			break;
    		}
    	}
    	
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
    	
    }
}
