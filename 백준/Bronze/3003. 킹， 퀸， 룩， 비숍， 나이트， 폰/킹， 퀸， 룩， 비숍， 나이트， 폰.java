
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
    	StringBuilder sb=new StringBuilder();
    	
    	int[] old= {1,1,2,2,2,8};
    	int[] my=new int[6];
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	for(int i=0;i<6;i++) {
    		my[i]=Integer.parseInt(st.nextToken());
    		sb.append(old[i]-my[i]).append(" ");
    	}
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    	
    }
}
