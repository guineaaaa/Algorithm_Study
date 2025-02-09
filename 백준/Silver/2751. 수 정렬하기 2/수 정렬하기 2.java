import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	
    	ArrayList<Integer> list=new ArrayList<>();
    	
    	for(int i=0;i<N;i++) {
    		list.add(Integer.parseInt(br.readLine()));
    	}
    	Collections.sort(list);
    	
    	StringBuilder sb=new StringBuilder();
    	for(int val: list) {
    		sb.append(val).append("\n");
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    }
    
}