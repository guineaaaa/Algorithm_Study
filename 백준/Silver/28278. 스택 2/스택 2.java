
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
    	
    	int N=Integer.parseInt(br.readLine()); //명령의 수
    	Stack<Integer> stack=new Stack<>();
    	
    	StringTokenizer st;
    	
    	for(int i=0;i<N;i++) {
    		st=new StringTokenizer(br.readLine());
    		Integer oper=Integer.parseInt(st.nextToken());
    		
    		switch(oper) { 
    		case 1: // 1 X : 정수 X를 스택에 넣는다.
    			int X=Integer.parseInt(st.nextToken());
    			stack.push(X);
    			break;
    		case 2: // 스택에 정수가 있다면 맨 위의 청수를 빼고 출력. 없으면 -1
    			if(stack.empty()) {bw.write("-1\n");}
    			else {bw.write(stack.pop()+"\n");}
    			break;
    		case 3: //스택에 들어있는 정수
    			bw.write(stack.size()+"\n");
    			break;
    		case 4: // 스택이 비어있음 1, 아님 0
    			if(stack.empty()) {bw.write("1\n");}
    			else {bw.write("0\n");}
    			break;
    		case 5: // 스택에 정수가 있다면 맨위 정수를 출력, 없다면 -1
    			if(stack.empty()) {bw.write("-1\n");}
    			else {bw.write(stack.peek()+"\n");}
    			break;
    		}
    	}
    	bw.flush(); bw.close();
    }
}
