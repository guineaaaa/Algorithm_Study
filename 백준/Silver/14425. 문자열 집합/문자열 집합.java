import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st=new StringTokenizer(br.readLine());
    	int N=Integer.parseInt(st.nextToken());
    	int M=Integer.parseInt(st.nextToken());
    	
    	Set<String> arr=new HashSet<>();
    	
    	for(int i=0;i<N;i++) {
    		arr.add(br.readLine()); // 중복 없이 추가
    	}
    	
    	int count=0;
    	for(int i=0;i<M;i++) {
    		String str=br.readLine();
    		
    		if(arr.contains(str)) {
    			count++;
    		}
    	}
    	
    	bw.write(String.valueOf(count));
    	bw.flush(); bw.close();
    }
    
}