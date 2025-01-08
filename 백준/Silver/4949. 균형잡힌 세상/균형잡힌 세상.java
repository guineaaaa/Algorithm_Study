
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
    	
    	String str;
    	
    	while(true) {
    		str=br.readLine();
    		
    		if(str.equals(".")) {break;} // 입력 종료조건
    		
    		if(findVPS(str)) { bw.write("yes\n");}
    		else { bw.write("no\n");}
    	}
    	
    	bw.flush(); bw.close();
    }
    
    public static boolean findVPS(String s) {
    	Stack<Character> stack=new Stack<>();
    	
    	
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		
    		if(ch=='('|| ch=='[') {
    			stack.push(ch);
    		}else if(ch==')') {
    			if(stack.isEmpty()||stack.pop()!='(') {
    				return false;
    			}
    		}else if(ch==']') {
    			if(stack.isEmpty()||stack.pop()!='[') {
    				return false;
    			}
    		}
    	}
    	
    	return stack.isEmpty(); // 모든 괄호가 짝이 맞아야 비어 있는거임
    	
    }
}
