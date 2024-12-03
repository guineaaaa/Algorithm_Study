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
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        
        int coin[]=new int[N];
        int count=0;
        
        for(int i=0;i<N;i++) {
        	coin[i]=Integer.parseInt(br.readLine());
        }
        
        // K원까지 필요한 동전의 개수 세기
        for(int i=N-1;i>=0;i--) {
        	if(K>=coin[i]) {
        		count+=K/coin[i];
        		K=K%coin[i];
        	}
        }
        
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
        
        
    }
}
