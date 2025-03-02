
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
    	
    	int n=Integer.parseInt(br.readLine());
    	
    	HashMap<String, String> employee=new HashMap<>();
    	
    	for(int i=0;i<n;i++) {
    		StringTokenizer str=new StringTokenizer(br.readLine());
    		String name=str.nextToken();
    		String log=str.nextToken();
    		
    		if(employee.containsKey(name)) {
    			employee.remove(name);
    		}else {
    			employee.put(name, log);
    		}
    	}
    	
    	// keySet()을 통해 리스트로 변환
    	// Hashmap은 정렬이 불가하므로 정렬이 필요한 경우 KeySet을 리스트로 변환 후 정렬 해야함
    	ArrayList<String> list=new ArrayList<String>(employee.keySet());
    	
    	Collections.sort(list, Collections.reverseOrder()); //이름 역순 정렬
    	
    	for(String name: list) {
    		bw.write(name+"\n");
    	}
     	
    	bw.flush();
    	bw.close();
    	
    	
    }
    
}