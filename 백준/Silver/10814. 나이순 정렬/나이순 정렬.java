
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N=Integer.parseInt(br.readLine());
    	String arr[][]=new String[N][2];
    	
    	for(int i=0;i<N;i++) {
    		st=new StringTokenizer(br.readLine());
    		arr[i][0]=st.nextToken(); //나이
    		arr[i][1]=st.nextToken(); //이름
    	}
    	Arrays.sort(arr, (s1, s2)->{
    		if(s1[0]==s2[0]) {
    			return 0;
    		}else {
    			return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
    		}
    	});
    	
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<N;i++) {
    		sb.append(arr[i][0]).append(" ").append(arr[i][1]+"\n");
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    }
    
}