
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	int[] line=new int[N];
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	for(int i=0;i<N;i++) {
    		line[i]=Integer.parseInt(st.nextToken());
    	}
    	
    	bw.write(solve(line));
    	bw.flush(); bw.close();
   }
    
    public static String solve(int[] line) {
    	int orderValue=1;
    	Stack<Integer> tmp=new Stack<>();
    	
    	for(int i=0;i<line.length;i++) {
    		if(line[i]==orderValue) {orderValue++;}
    		else {
    			if(!tmp.isEmpty()&&tmp.peek()==orderValue) {
    				tmp.pop();
    				i--; // line에서 얻은 값이 아니고 tmp(임시 저장소에서 얻은 값이어서)
    				orderValue++;
    			}else {
    				tmp.push(line[i]);
    			}
    		}
    	}
    	boolean result=true;
    	
    	// 임시 저장소에 값이 남아있을 경우 탐색

    	while(!tmp.isEmpty()) {
    		if(tmp.peek()==orderValue) {
    			tmp.pop();
    			orderValue++;
    		}else {
    			result=false;
    			break;
    		}
    	}
    	
    	return result ? "Nice":"Sad";
    }
    
}