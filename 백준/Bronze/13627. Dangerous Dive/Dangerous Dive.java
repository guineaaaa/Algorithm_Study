import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			// 첫번째 줄 N, R 입력하기
			StringTokenizer st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken()); // 임무에 간 봉사자들 수
			int R=Integer.parseInt(st.nextToken()); // 돌아올 봉사자들 수
			
			// 전체 봉사자들 초기화하기
			boolean[] returned=new boolean[N+1];
			for(int i=1;i<=N;i++) { //1부터 시작
				returned[i]=false;
			}
			
			// 두번째 줄 입력 받기
			st=new StringTokenizer(br.readLine());
			
			// 돌아온 봉사자들 배열에 표시하기
			for(int i=0;i<R;i++) {
				int id=Integer.parseInt(st.nextToken());
				returned[id]=true;
			}
			
			boolean allReturned=true;
			StringBuilder sb=new StringBuilder();
			
			// 돌아오지 않은 봉사자들 검사하기
			for(int i=1;i<=N;i++) {
				if(!returned[i]) { // returned가 false이면
					sb.append(i).append(" ");
                    allReturned=false;
				}
				
			}
			
			// 결과 출력하기
			if(allReturned) {
				System.out.println("*");
			}else {
				System.out.println(sb.toString().trim());
			}
		}	

}
