
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	int N=Integer.parseInt(br.readLine());
    	StringBuffer bf=new StringBuffer();
    	
    	// 삽입 후 절댓값이 작은 값을 기준으로 front에 위치시킨다.
    	// 우선순위 큐 정렬 기준을 만들어야한다.
    	PriorityQueue<Integer> myQueue=new PriorityQueue<>((o1,o2)->{
    		int FirstABS=Math.abs(o1);
    		int SecondABS=Math.abs(o2);
    		
    		if(FirstABS==SecondABS) {
    			return o1>o2?1:-1;
    		}else {
    			return FirstABS-SecondABS;
    		}
    	});
    	
    	for(int i=0;i<N;i++) {
    		int num=Integer.parseInt(br.readLine());
    		
    		if(num==0) {
    			if(myQueue.isEmpty()) {
    				System.out.println("0");
    			}else {
    				System.out.println(myQueue.poll());
    			}
    		}else {
    			myQueue.add(num);
    		}
    	}
    }
}
