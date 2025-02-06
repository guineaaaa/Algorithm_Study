
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	int[] arr=new int[N];
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	Deque<int[]> deque=new ArrayDeque<>();
    	
    	for(int i=0;i<N;i++) {
    		arr[i]=Integer.parseInt(st.nextToken());
    	}
    	
    	StringBuilder sb=new StringBuilder();
    	sb.append("1 ");
    	
    	int in=arr[0];
    	
    	for(int i=1;i<N;i++) {
    		deque.add(new int[] {(i+1), arr[i]}); //{풍선 인덱스, 내용}
    	}
    	while(!deque.isEmpty()) {
    		if(in>0) {
    			for(int i=1;i<in;i++) {
    				deque.add(deque.poll());
    			}
    			int[] next=deque.poll();
    			in=next[1]; // 풍선 속의 내용
    			sb.append(next[0]+ " ");
    		}
    		else {
    			for(int i=1;i<-in;i++) {
    				deque.addFirst(deque.pollLast());
    			}
    			int[] next=deque.pollLast();
    			in=next[1];
    			sb.append(next[0]+" ");
    		}
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    }
    
}