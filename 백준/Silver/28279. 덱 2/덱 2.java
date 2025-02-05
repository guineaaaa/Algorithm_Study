import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	Deque<Integer> deque=new LinkedList<>();
    	StringTokenizer st;
    	
    	for(int i=0;i<N;i++) {
    		st=new StringTokenizer(br.readLine());
    		int oper=Integer.parseInt(st.nextToken());
    		
    		switch(oper) {
    		case 1: // 정수 X를 덱의 앞에 넣음
    			deque.offerFirst(Integer.parseInt(st.nextToken()));
    			break;
    		case 2:
    			deque.offerLast(Integer.parseInt(st.nextToken()));
    			break;
    		case 3:
    			if(deque.isEmpty()) {bw.write("-1\n");}
    			else{bw.write(deque.pollFirst()+"\n");}
    			break;
    		case 4:
    			if(deque.isEmpty()) {bw.write("-1\n");}
    			else {
    			bw.write(deque.pollLast()+"\n");}
    			break;
    		case 5:
    			bw.write(deque.size()+"\n");
    			break;
    		case 6:
    			if(deque.isEmpty()) {bw.write("1\n");}
    			else {bw.write("0\n");}
    			break;
    		case 7:
    			if(deque.isEmpty()) {bw.write("-1\n");}
    			else {
    				bw.write(deque.peekFirst()+"\n");
    			}
    			break;
    		case 8:
    			bw.write(deque.isEmpty()?"-1\n":deque.peekLast()+"\n");
    			break;
    		}
    		
    	}
    	bw.flush(); bw.close();
    }
    
}