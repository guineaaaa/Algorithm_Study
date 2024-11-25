
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			int [] arr=new int[26]; // a~z 개수
			
			for(int i=0;i<26;i++) {
				arr[i]=-1;
			}
			
			String S=br.readLine();
			
			for(int i=0;i<S.length();i++) {
				char c=S.charAt(i);
				
				if(arr[c-'a']==-1) {
					arr[c-'a']=i;
				}
			}
			
			for(int val:arr) {
				System.out.print(val+" ");
			}
		}
		
		
}
