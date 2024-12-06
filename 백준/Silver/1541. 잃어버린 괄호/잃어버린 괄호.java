
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 핵심: 덧셈 부분을 먼저 계산 해야 한다.
         * 1. 뺄셈을 기준으로 문자열을 분리 (덧셈 부분을 먼저 계산하기 위해 분리해줘야한다.)
         * 2. 분리된 문자열들에 포함된 값들을 모두 덧셈 해준다.
         * 3. 각각 더해진 값들을 뺄셈 해주면 결과를 얻을 수 있다.
         * 
         * ["55","50+40"] 
         * 55: 초기값으로 사용되고, 나머지는 연산의 대상으로 사용된다.
         * 첫번째 토큰은 res에 그대로 저장 해야 한다.
         */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer sub=new StringTokenizer(br.readLine(),"-");
    	
    	int res=Integer.MAX_VALUE;// 첫번째 값을 설정하기 위함 (아직 계산되지 않은 값 이라면..)
    	while(sub.hasMoreTokens()) {
    		int temp=0;
    		// 덧셈 기준으로 한번 더 분리하기
    		StringTokenizer add=new StringTokenizer(sub.nextToken(),"+");
    		
    		// 덧셈의 값들을 더하기
    		while(add.hasMoreTokens()) {
    			temp+=Integer.parseInt(add.nextToken());
    		}
    		
    		// 각각 더해진 값들을 뺄셈 해주기.
    		// 단, 첫번째 토큰인 경우에는 temp가 첫번째 수가 된다.
    		if(res==Integer.MAX_VALUE) {
    			res=temp;
    		}else {
    			res-=temp;
    		}
    		
    	}
    	
    	bw.write(String.valueOf(res));
    	bw.flush();
    	bw.close();
    	
    }
}
