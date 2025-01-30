
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
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	int a=Integer.parseInt(st.nextToken());
    	int b=Integer.parseInt(st.nextToken());
    	int c=Integer.parseInt(st.nextToken());
    	int d=Integer.parseInt(st.nextToken());
    	int e=Integer.parseInt(st.nextToken());
    	int f=Integer.parseInt(st.nextToken());
    	
    	for(int x=-999;x<=999;x++) {
    		for(int y=-999; y<=999;y++) {
    			if(a*x+b*y==c) {
    				if(d*x+e*y==f) {
    					bw.write(x+" "+y);
    				}
    			}
    		}
    	}
    	
    	bw.flush(); bw.close();
    }
    
}