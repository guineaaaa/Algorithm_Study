
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
			
			String str=br.readLine();
			str=str.toUpperCase();
			
			int[] count=new int[26];
			
			for(int i=0;i<str.length();i++) {
				int num=str.charAt(i)-'A';
				// 대문자를 배열의 인덱스로 변환
				count[num]++;
			}
			
			int max=0;
			char result='?';
			for(int i=0;i<count.length;i++) {
				if(count[i]>max) {
					max=count[i];
					result=(char)(i+'A');
				}else if(count[i]==max) {
					result='?';
				}
			}
			
			bw.write(result);
			bw.flush();
			
		}
}
