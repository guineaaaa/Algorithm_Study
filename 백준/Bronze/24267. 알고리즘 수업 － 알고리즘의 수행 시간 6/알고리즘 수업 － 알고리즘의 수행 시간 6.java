
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	Long n=Long.parseLong(br.readLine());
    	
    	/**
    	 * i=1~n-2 (반복 범위: n-2)
    	 * j=i+1~n-1 (반복 범위: n-1)
    	 * k=j+1~n   (반복 범위: n)
    	 */
    	
    	
    	bw.write((n*(n-1)*(n-2)/6)+"\n" + 3);
    	bw.flush();
    	bw.close();
    }
    
    
}
