import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb=new StringBuilder();
    	
    	StringTokenizer st=new StringTokenizer(br.readLine()," ");
    	
    	// 배열의 크기
    	int N=Integer.parseInt(st.nextToken());
    	int M=Integer.parseInt(st.nextToken());
    	
    	int arr[][]=new int[N][M];
    	
    	for(int i=0;i<N;i++) {
    		StringTokenizer st1=new StringTokenizer(br.readLine());
    		for(int j=0;j<M;j++) {
    			arr[i][j]=Integer.parseInt(st1.nextToken());
    		}
    	}
    	
    	// (i,j)->(x,y)
    	int K=Integer.parseInt(br.readLine());
    	
    	for(int m=0;m<K;m++) {
    		StringTokenizer st2=new StringTokenizer(br.readLine());
    		int sum=0;
    		
			int i=Integer.parseInt(st2.nextToken())-1;
			int j=Integer.parseInt(st2.nextToken())-1;
			int x=Integer.parseInt(st2.nextToken())-1;
			int y=Integer.parseInt(st2.nextToken())-1;
    			
			for(int k=i;k<=x;k++) {
        		for(int l=j;l<=y;l++) {
        			sum+=arr[k][l];
        		}
        	}
			sb.append(sum+"\n");
    		
    	}
    	
    	System.out.println(sb.toString());
    	
    	
    }
}
