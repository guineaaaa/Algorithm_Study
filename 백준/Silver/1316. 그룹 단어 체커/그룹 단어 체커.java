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
    	/**
    	 * 핵심: 떨어져 나갔을 때 한번 더 나타나는 단어를 잡자
    	 */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 단어의 개수
    	int N=Integer.parseInt(br.readLine());
    	
    	int count=0;
    	// 단어들 입력받기
    	for(int i=0;i<N;i++) {
    		String s=br.readLine();
    		if(isGroupWord(s)) {
    			count++;
    		}
    	}
    	
    	bw.write(String.valueOf(count));
    	bw.close();
    	
    }
    
	public static boolean isGroupWord(String word) {
		boolean[] seen=new boolean[26]; // 소문자 개수. 방문 여부를 트래킹 하기 위함
		char prevChar='\0';
		
		for(int i=0;i<word.length();i++) {
			char currentChar=word.charAt(i);
			
			// 이전 문자와 다른 경우
			if(prevChar!=currentChar) {
				// 이미 표시된 적이 있는 단어라면, 그룹 단어가 아님. 함수 종료
				if(seen[currentChar-'a']) {return false;}
				// 이미 표시된 적이 없는 단어를 갱신
				else { seen[currentChar-'a']=true;}
			}
			prevChar=currentChar; // 연속된 동일 문자를 처리한다.
			// 연속된 동일 문자는 seen[]을 확인할 필요가 없다.
		}
		// 반복문의 조건에서 걸리지 않는다면 그룹 단어가 맞음
		return true;
	}
    
}
