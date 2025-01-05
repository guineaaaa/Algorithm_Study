
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	int result=solve(N);
    	
    	System.out.println(result);
    }
    
    // 큐로 구하는 함수
    public static int solve(int n) {
    	Queue<Integer> queue=new LinkedList<>();
    	
    	for(int i=1;i<=n;i++) {
    		queue.add(i);
    	}
    	
    	while(queue.size()>1) {
    		queue.poll();
    		int num=queue.poll();
    		queue.add(num);
    	}
    	
    	return queue.poll();
    }
}
