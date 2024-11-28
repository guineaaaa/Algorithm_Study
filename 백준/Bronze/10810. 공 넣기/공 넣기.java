
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
			int[] arr=new int[N];
			
			int M=Integer.parseInt(st.nextToken());
			
			for(int n=0;n<M;n++) {
				st=new StringTokenizer(br.readLine());
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				int k=Integer.parseInt(st.nextToken());
				
				for(int m=i-1;m<j;m++) {
					arr[m]=k;
				}
			}
			
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]).append(" ");
			}
			
			System.out.println(sb.toString());
			

		}
}
