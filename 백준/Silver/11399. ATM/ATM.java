
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
        
        int[] arr=new int[N];
        
        st=new StringTokenizer(br.readLine());
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int prevSum=0; //누적 대기 시간
        int minSum=0; //사람 별 대기 시간 총합
        for(int i=0;i<arr.length;i++) {
        	minSum+=prevSum+arr[i];
        	prevSum+=arr[i];
        }
        
        bw.write(String.valueOf(minSum));
        bw.flush();
        bw.close();
    }
}
