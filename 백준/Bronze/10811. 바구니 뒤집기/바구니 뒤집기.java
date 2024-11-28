
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			int arr[]=new int[N]; int temp=0;
			
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=i+1;
			}
			
	
			for(int n=0;n<M;n++) {
				st=new StringTokenizer(br.readLine());
				int i=Integer.parseInt(st.nextToken())-1; // i부터
				int j=Integer.parseInt(st.nextToken())-1; // j까지 순서를 역순으로
				
				while(i<j) { // 교차할때까지 반복하며 범위를 점진적으로 좁히며 뒤집음
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++; j--;
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				bw.write(arr[i]+" ");
			}
			bw.flush();
			bw.close();

		}
}
