
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()); // 카드의 개수
        int M=Integer.parseInt(st.nextToken()); // 카드의 합은 M을 넘어선 안된다
        
        int arr[]=new int[N];
        
        StringTokenizer cards=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
        	arr[i]=Integer.parseInt(cards.nextToken());
        }
        
        Arrays.sort(arr); // 오름차순 정렬
        
        // M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력하기
        // (5,6,7)->(6,7,8)->(7,8,9) 이런 순서로 갱신해 나간다.
        // 3중 반복문으로 해결할 수 있음
        int result=0;
        
        for(int i=0;i<N-2;i++) {
        	for(int j=i+1;j<N-1;j++) {
        		for(int k=j+1;k<N;k++) {
        			int temp=arr[i]+arr[j]+arr[k];
        			
        			// temp가 M보다 작거나 같고, temp가 result(현재 최대 합) 보다 크다면
        			if((temp<=M) &&(temp>result)) {
        				result=temp;
        			}
        		}
        	}
        }
        bw.write(String.valueOf(result));
        bw.flush();
        
        bw.close();
       
    }
}
