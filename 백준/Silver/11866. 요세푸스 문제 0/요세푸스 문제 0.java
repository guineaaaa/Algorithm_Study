
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	LinkedList<Integer> list=new LinkedList<Integer>();
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	StringBuilder sb=new StringBuilder();
    	
    	int N=Integer.parseInt(st.nextToken());
    	int K=Integer.parseInt(st.nextToken());
    	
    	for(int i=1;i<=N;i++) {
    		list.add(i);
    	}
    	
    	sb.append("<");
    	
    	int index=0;
    	while(N>1) {
    		
    		index=(index+(K-1))%list.size();
    		sb.append(list.remove(index)).append(", ");
    		N--;
    	}
    	
    	// 마지막으로 남은 요소
    	sb.append(list.remove()).append(">");
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    	
    }
}
