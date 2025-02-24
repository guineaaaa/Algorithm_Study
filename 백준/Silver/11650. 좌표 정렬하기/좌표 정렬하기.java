
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
    		arr[i][0]=Integer.parseInt(st.nextToken()); //x좌효
    		arr[i][1]=Integer.parseInt(st.nextToken()); //y좌표
    	}
    	
    	// x좌표가 동일할 경우 y좌표 기준으로 정렬해야한다.
    	// Arrays.sort는 배열의 원소들이 Comparable 인터페이스를 구현하고 있어야
    	// Comparator 를 직접 정의해줘야 정상적으로 정렬 가능함.
    	Arrays.sort(arr, (o1,o2)->{
    		if(o1[0]==o2[0]) {
    			return o1[1]-o2[1];
    		}else {
    			return o1[0]-o2[0];
    		}
    	
    	});
    	
    	StringBuilder sb=new StringBuilder();
    	
    	for(int i=0;i<N;i++) {
    		sb.append(arr[i][0]+" "+arr[i][1]+"\n");
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();

    }
    
}