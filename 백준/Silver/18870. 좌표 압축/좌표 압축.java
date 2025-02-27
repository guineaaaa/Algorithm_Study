import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	/**
    	 *  원본 배열 입력 받기 -> 원본 배열 정렬
    	 *  -> HashMap으로 정렬된 배열 압축 + 우선순위 ranking
    	 *  -> 원본 배열 순서 대로 rank 출력
    	 *  정렬된 배열을 순회하면서 중복된 숫자는 무시하고 최초 등장하는 숫자에만 Rank를 부여하자
    	 */
    	int N=Integer.parseInt(br.readLine());
    	
    	int arr[]=new int[N];
    	int sortedArr[]=new int[N];
    	
    	HashMap<Integer, Integer> pressed=new HashMap<Integer, Integer>();
    	
    	st=new StringTokenizer(br.readLine());
    	for(int i=0;i<N;i++) {
    		arr[i]=sortedArr[i]=Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(sortedArr);
    	
    	// 배열 압축
    	int rank=0;
    	for(int val: sortedArr) {
    		if(!pressed.containsKey(val)) {
    			pressed.put(val, rank);
    			rank++;
    		}
    	}
    	
    	// 원본 배열 기준으로 출력하기
    	StringBuilder sb=new StringBuilder();
    	for(int val: arr) {
    		sb.append(pressed.get(val)).append(" ");
    	}
    	
    	bw.write(sb.toString());
    	bw.flush(); bw.close();
    }
    
}