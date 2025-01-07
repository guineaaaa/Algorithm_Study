
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
    	
    	int T=Integer.parseInt(br.readLine());
    	String arr[]=new String[T];
    	
    	for(int i=0;i<T;i++) {
    		arr[i]=br.readLine();
    	}
    	
    	for(int i=0;i<T;i++) {
    		if(findVPS(arr[i])) {
    			bw.write("YES\n");
    		}else {
    			bw.write("NO\n");
    		}
    	}
    	bw.flush();
    	bw.close();
    	
    }
    
    public static boolean findVPS(String str) {
    	Stack<Character> stack=new Stack<>();
    	
    	for(int i=0;i<str.length();i++) {
    		char ch=str.charAt(i);
    		
    		if(ch=='(') {
    			stack.push(ch);
    		}else if(ch==')') {
    			if(stack.isEmpty()) {
    				return false;
    			}else {
    				stack.pop();
    			}
    		}
    	}
    	
    	return stack.isEmpty();
    }
}
