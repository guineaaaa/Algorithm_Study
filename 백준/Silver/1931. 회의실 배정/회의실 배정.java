
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
        
        int N=Integer.parseInt(br.readLine()); // 회의의 수
        
        int arr[][]=new int[N][2]; // 회의의 정보
        
        for(int i=0;i<N;i++) {
        	StringTokenizer st=new StringTokenizer(br.readLine());
        	arr[i][0]=Integer.parseInt(st.nextToken()); // 시작 시간
        	arr[i][1]=Integer.parseInt(st.nextToken()); // 종료 시간
        }
        
        // 종료 시간 기준으로 정렬하긴
        Arrays.sort(arr, new Comparator<int[]>() {
        	public int compare(int[] o1,int[] o2) {
        		if(o1[1]==o2[1]) { //만약 종료 시간이 같다면
        			return Integer.compare(o1[0], o2[0]);
        			// 시작 시간을 비교한다.
        		}
        		return Integer.compare(o1[1], o2[1]);
        		// 종료 시간을 비교한다.
        	}
        });
        
        int count=0;
        int prev=0;
        
        for(int i=0;i<N;i++) {     	
        	if(prev<=arr[i][0]) {
        		prev=arr[i][1];
        		count++;
        	}
        	
        }
        
        bw.write(String.valueOf(count));
        bw.close();

    }
}
