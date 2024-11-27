import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			
			int[][]arr=new int[9][9];
			
			for(int i=0;i<9;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<9;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			StringBuilder sb=new StringBuilder();
			
			int max=arr[0][0],row=0,col=0;
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					if(arr[i][j]>max) {
						max=arr[i][j];
						row=i; col=j;
					}
				}
			}
			sb.append(row+1).append(" ").append(col+1);
			
			System.out.println(max);
			System.out.println(sb.toString());
			
		}
		
		
}
