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
    	StringBuilder sb=new StringBuilder();
    	
    	int T=Integer.parseInt(br.readLine()); //Test case
    	int apt[][]=new int[15][15];
    	
    	// 0층의 i호에는 i명이 산다.
    	for(int i=1;i<15;i++) {
    		apt[0][i]=i;
    	}
    	
    	for(int i=1;i<15;i++) {
    		for(int j=1;j<15;j++) {
    			apt[i][j]=apt[i-1][j]+apt[i][j-1];
    		}
    	}
    	
    	for(int i=0;i<T;i++) {
    		int k=Integer.parseInt(br.readLine());
    		int n=Integer.parseInt(br.readLine());
    		
    		sb.append(apt[k][n]).append("\n");
    	}
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    	
    }    
}