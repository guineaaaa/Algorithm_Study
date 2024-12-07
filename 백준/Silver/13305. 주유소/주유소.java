
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
        
        int N=Integer.parseInt(br.readLine()); // 도시의 개수
        StringTokenizer dis=new StringTokenizer(br.readLine());
        StringTokenizer cst=new StringTokenizer(br.readLine());
        
        int distance[]=new int[N-1];
        long cost[]=new long[N];
        
        // 거리
        for(int i=0;i<N-1;i++) {
        	distance[i]=Integer.parseInt(dis.nextToken());
        }
        
        // 비용
        for(int i=0;i<N;i++) {
        	cost[i]=Long.parseLong(cst.nextToken());
        }
        
        long sum=0;
        long minCost=cost[0]; // 주유 최소 비용. 첫번째 주유소는 필수
        
        for(int i=0;i<N-1;i++) {
        	if(cost[i]<=minCost) {
        		minCost=cost[i];
        	}
        	sum+=(minCost*distance[i]);
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }
}
