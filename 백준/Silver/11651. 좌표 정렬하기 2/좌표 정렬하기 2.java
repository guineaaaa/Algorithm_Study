import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N=Integer.parseInt(br.readLine());
    	int arr[][]=new int[N][2];
    	
    	for(int i=0;i<N;i++) {
    		st=new StringTokenizer(br.readLine());
    		arr[i][0]=Integer.parseInt(st.nextToken());
    		arr[i][1]=Integer.parseInt(st.nextToken());
    	}
    	
    	// y좌표 기준으로 정렬.
    	// But y좌표가 동일할 시 x 좌표 기준으로 정렬한다.
    	Arrays.sort(arr, (o1,o2)->{
    		if(o1[1]==o2[1]) {
    			return o1[0]-o2[0];
    		}else {
    			return o1[1]-o2[1];
    		}
    	});
    	
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<N;i++) {
    		bw.write(arr[i][0]+" "+arr[i][1]+"\n");
    	}
    	
    	bw.flush(); bw.close();
    	
    }
    
}