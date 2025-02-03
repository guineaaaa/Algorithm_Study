
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
    	
    	int T=Integer.parseInt(br.readLine());
    	StringTokenizer st;
    	
    	for(int i=0;i<T;i++) {
    		st=new StringTokenizer(br.readLine());
    		int a=Integer.parseInt(st.nextToken());
    		int b=Integer.parseInt(st.nextToken());
    		
    		int num=1;
    		for(int j=0;j<b;j++) {
    			num=(a*num)%10;
    			if(num==0)num=10;
    		}
    		bw.write(num+"\n");
    	}
    	bw.flush(); bw.close();
    }
    
}