
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
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				
				temp=arr[i-1];
				arr[i-1]=arr[j-1];
				arr[j-1]=temp;
			}
			for(int i=0;i<arr.length;i++) {
				bw.write(arr[i]+" ");
			}
			bw.flush();
			bw.close();

		}
}
