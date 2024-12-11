
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
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	int arr[]=new int[8];
    	
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=Integer.parseInt(st.nextToken());
    	}
    	
    	/**
    	 * 전부 맞다고 상정하고 아닌 부분을 거르자.
    	 */
    	boolean isAscending=true;
    	boolean isDescending=true;

    	
    	String result="";
    	for(int i=0;i<arr.length-1;i++) {
    		if(arr[i+1]!=arr[i]+1) {
    			isAscending=false;
    		}
    		if(arr[i+1]!=arr[i]-1) {
    			isDescending=false;
    		}
    	}
    		
    	if(isAscending) {result="ascending";}
    	else if(isDescending) {result="descending";}
    	else {result="mixed";}
    
    	bw.write(result);
    	bw.close();
    }
    
    
}
