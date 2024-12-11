
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
    	
    	int result=A*B*C;
    	StringBuilder sb=new StringBuilder();
    	sb.append(result);
    	sb.toString();
    	
    	int count[]=new int[10];

    	
    	for(int i=0;i<sb.length();i++) {
    		char c=sb.charAt(i);
    		
    		switch(c) {
    		case '0':
    			count[0]++; break;
    		case '1': 
    			count[1]++; break;
    		case '2':
    			count[2]++; break;
    		case '3':
    			count[3]++;break;
    		case '4':
    			count[4]++;break;
    		case '5':
    			count[5]++;break;
    		case '6':
    			count[6]++;break;
    		case '7':
    			count[7]++;break;
    		case '8':
    			count[8]++;break;
    		case '9':
    			count[9]++;break;
    		}
    	}
    	
    	for(int i=0;i<count.length;i++) {
    		bw.write(String.valueOf(count[i])+"\n");
    	}
    	
    	bw.close();
    }
    
    
}
