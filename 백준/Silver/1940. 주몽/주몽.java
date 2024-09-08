import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int N=Integer.parseInt(bf.readLine()); // 재료의 개수
			int M=Integer.parseInt(bf.readLine()); // 갑옷이 되는 번호
			int[] A=new int[N];
			
			StringTokenizer st=new StringTokenizer(bf.readLine());
			for(int i=0;i<N;i++) { // 재료 배열 저장하기
				A[i]=Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(A); // 재료 배열 정렬하기
			
			int count=0,i=0,j=N-1;
			
			// 투 포인터 이동 원칙에 따라 포인터를 이동하면서 처리하기
			while(i<j) {
				if(A[i]+A[j]<M) {
					i++;
				}else if(A[i]+A[j]>M) {
					j--;
				}else {
					i++; j--;
					count++;
				}
			}
			System.out.println(count);
			
			bf.close();
	
	}

}
