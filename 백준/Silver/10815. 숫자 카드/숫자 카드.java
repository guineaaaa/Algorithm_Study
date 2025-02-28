import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N=Integer.parseInt(br.readLine());
    	HashMap<Integer, Integer> myCard=new HashMap<>();
    	
    	st=new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++) {
    		myCard.put(Integer.parseInt(st.nextToken()), 0);
    	}
    	
    	int M=Integer.parseInt(br.readLine());
    	st=new StringTokenizer(br.readLine());
    	
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<M;i++) {
    		if(myCard.get(Integer.parseInt(st.nextToken()))!=null) {
    			sb.append("1 ");
    		}else {
    			sb.append("0 ");
    		}
    	}
    	bw.write(sb.toString());
    	bw.flush(); bw.close();}

    
}