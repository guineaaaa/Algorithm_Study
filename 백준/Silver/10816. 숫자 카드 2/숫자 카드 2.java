import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N=Integer.parseInt(br.readLine());
    	HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
    	
    	st=new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++) {
    		int key=Integer.parseInt(st.nextToken());
    		map.put(key, map.getOrDefault(key, 0)+1);
    	}
    	
    	int M=Integer.parseInt(br.readLine());
    	StringBuilder sb=new StringBuilder();
    	
    	st=new StringTokenizer(br.readLine());
    	for(int i=0;i<M;i++) {
    		int key=Integer.parseInt(st.nextToken());
    		sb.append(map.getOrDefault(key, 0)).append(" ");
    	}
    	bw.write(sb.toString());
    	bw.flush();
    	bw.close();
    	
    }
    
}