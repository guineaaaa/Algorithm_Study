
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int A=Integer.parseInt(br.readLine());
    	int B=Integer.parseInt(br.readLine());
    	int C=Integer.parseInt(br.readLine());
    	
    	int res1=(A+B)-C;
    	
    	StringBuilder sb=new StringBuilder();
    	sb.append(A).append(B);
    	String str=sb.toString();
    	
    	int temp=Integer.parseInt(str);
    	int res2=temp-C;
    	
    	System.out.println(res1+"\n"+res2);
    	
    	
    }
    
    
}
