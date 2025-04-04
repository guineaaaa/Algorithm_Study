import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		// A의 원소 개수
		int A=Integer.parseInt(st.nextToken()); 
		// B의 원소 개수
		int B=Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> Aset=new TreeSet<>();
		TreeSet<Integer> Bset=new TreeSet<>();
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<A;i++) {
			Aset.add(Integer.parseInt(st.nextToken()));
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<B;i++) {
			Bset.add(Integer.parseInt(st.nextToken()));
		}
		
		// 원본 보호를 위한 복사본 만들기
		TreeSet<Integer> Atemp=new TreeSet<>(Aset);
		TreeSet<Integer> Btemp=new TreeSet<>(Bset);
		
		int res1=0, res2=0;
		// (A-B) 대칭차집합
		while(!Atemp.isEmpty()) {
			int n=Atemp.pollFirst();
			if(!Bset.contains(n)) {
				res1++;
			}
		}
		
		// (B-A) 대칭차집합
		while(!Btemp.isEmpty()){
			int n=Btemp.pollFirst();
			if(!Aset.contains(n)) {
				res2++;
			}
		}
		
		int result=res1+res2;
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
