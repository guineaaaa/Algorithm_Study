
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
    	
    	StringBuilder sb=new StringBuilder();
    	
    	int N=Integer.parseInt(br.readLine());
    	
    	LinkedList<Integer> queue=new LinkedList<>();
    	
    	for(int i=0;i<N;i++) {
    		StringTokenizer command=new StringTokenizer(br.readLine()," ");
    		
    		switch(command.nextToken()) {
    		case "push":
    			queue.add(Integer.parseInt(command.nextToken()));
    			break;
    		case "pop":
    			if(queue.isEmpty()) {sb.append(-1).append("\n");}
    			else{sb.append(queue.poll()+"\n");}
    			break;
    		case "size":
    			sb.append(queue.size()+"\n");
    			break;
    		case "empty":
    			if(queue.isEmpty()) {sb.append(1).append("\n");}
    			else {sb.append(0).append("\n");}
    			break;
    		case "front":
    			if(queue.isEmpty()) {sb.append(-1).append("\n");}
    			else{sb.append(queue.peek()+"\n");}
    			break;
    		case "back":
    			if(queue.isEmpty()) {sb.append(-1).append("\n");}
    			else {sb.append(queue.getLast()+"\n");}
    			break;
    		}
    	}
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    	
    }
}
