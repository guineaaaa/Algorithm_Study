
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	// BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	String arr[]=new String[N];
    	
    	for(int i=0;i<N;i++) {
    		arr[i]=br.readLine();
    	}
    	
    	for(int i=0;i<N;i++) {
    		int score=0; // 총점수
    		int temp=0; // 연속된 'O'의 누적 점수
    		
    		for(int j=0;j<arr[i].length();j++) {
    			if(arr[i].charAt(j)=='O') {
    				temp++;
    				score+=temp;
    			}else { //'O'가 아니라면 초기화하기
    				temp=0;
    			}
    		}
    		System.out.println(score);
    	}
    	
    }
    
    
}
