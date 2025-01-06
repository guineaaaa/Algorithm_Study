
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int K=Integer.parseInt(br.readLine());
    	Stack<Long> stack=new Stack<>();
    	
    	for(int i=0;i<K;i++) {
    		long n=Long.parseLong(br.readLine());
    		
    		if(n==0) {
    			stack.pop();
    		}else {
    			stack.push(n);
    		}
    	}
    	
    	long result=0;
    	
    	while(stack.size()>0) {
    		result+=stack.pop();
    	}
    	
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
    }
}
