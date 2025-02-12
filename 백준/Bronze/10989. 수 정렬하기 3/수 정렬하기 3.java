import java.io.BufferedReader;
import java.io.BufferedWriter;  
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  
import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<N;i++){
            sb.append(arr[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush(); bw.close();
    }
}