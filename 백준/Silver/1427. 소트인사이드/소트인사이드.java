
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str=br.readLine();
    	int length=str.length();
    	
    	Integer[] arr=new Integer[length];
    	// Collections을 사용하기 위함
    	
    	// 문자 -> 숫자
    	for(int i=0;i<length;i++) {
    		arr[i]=str.charAt(i)-'0';
    	}
    	
    	Arrays.sort(arr, Collections.reverseOrder());
    	
    	StringBuilder sb=new StringBuilder();
    	for(int num: arr) {
    		sb.append(num);
    	}
    	
    	bw.write(sb.toString());
    	bw.flush();    	bw.close();

    }
    
}