import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	int N=Integer.parseInt(st.nextToken()); // 듣도 못함
    	int M=Integer.parseInt(st.nextToken()); // 보도 못함
    	
    	// 듣도 못함
    	HashSet<String> set=new HashSet<>();
    	for(int i=0;i<N;i++) {
    		set.add(br.readLine());
    	}
    	
    	
    	ArrayList<String> result=new ArrayList<>();
    	
    	// 보도 못함
    	for(int i=0;i<M;i++) {
    		String str=br.readLine();
    		// 듣도 보도 못함
    		if(set.contains(str)) {
    			result.add(str);
    		}
    	}
    	
    	Collections.sort(result);
    	
    	StringBuilder sb=new StringBuilder();
    	sb.append(result.size()).append("\n");
    	for(int i=0;i<result.size();i++) {
    		sb.append(result.get(i)).append("\n");
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    }    
}