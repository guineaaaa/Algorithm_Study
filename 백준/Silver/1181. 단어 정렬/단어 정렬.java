import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	String[] arr=new String[N];
    	
    	for(int i=0;i<N;i++) {
    		arr[i]=br.readLine();
    	}
    	
    	// 길이가 짧은 순으로 정렬
    	// if 길이가 같다면 사전 순으로 정렬한다
    	Arrays.sort(arr, (s1, s2)->{
    		if(s1.length()==s2.length()) {
    			return s1.compareTo(s2);
    		}else {
    			return s1.length()-s2.length();
    		}
    	});
    	
    	StringBuilder sb=new StringBuilder();
    	sb.append(arr[0]+"\n");
    	
    	// i=1부터 시작하지 않으면 중복 검출시 index가 -1이되어버림 그러므로 첫번째 인덱스 미리삽입
    	for(int i=1;i<N;i++) {
    		// 중복 검출 이미 정렬되었다면 같은 길이&&같은 단어는 인덱스 1차이로 존재
    		if(!arr[i].equals(arr[i-1])) {
    			sb.append(arr[i]+"\n");
    		}
    		
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    	
    	
    }
    
}