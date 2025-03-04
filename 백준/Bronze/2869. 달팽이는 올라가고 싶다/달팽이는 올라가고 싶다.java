
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
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	
    	int A=Integer.parseInt(st.nextToken());
    	int B=Integer.parseInt(st.nextToken());
    	int V=Integer.parseInt(st.nextToken());
    	
    	int dayMove=A-B;
    	int destination=V-B;
    	
    	// 최종 목적지
    	if(destination%dayMove!=0) {
    		bw.write(String.valueOf(destination/dayMove+1));
    	}else {
    		// 나누어 떨어지면 낮에 도착
    		bw.write(String.valueOf(destination/dayMove));
    	}
    	bw.flush();
    	bw.close();
    }
    
}