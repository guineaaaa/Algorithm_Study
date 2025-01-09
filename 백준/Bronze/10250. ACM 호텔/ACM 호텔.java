
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuffer bf=new StringBuffer();
    	StringTokenizer st;
    	
    	int T=Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<T;i++) {
    		st=new StringTokenizer(br.readLine());
    		
    		// int h,w,res;
    		int H=Integer.parseInt(st.nextToken()); // 층 수
    		int W=Integer.parseInt(st.nextToken()); // 방 수
    		int N=Integer.parseInt(st.nextToken()); // N 번째 손님
    		
    		// 층 계산
    		int floor=(N%H==0)? H:(N%H);
    		// 호수
    		int room=(N%H==0)? (N/H):(N/H)+1;
    		
    		/*if(N%H==0) { h=H*100;}
    		else { h=(N%H)*100;}
    		w=(N/H)+1;
    		
    		res=h+w;*/
    		//bf.append(res+"\n");
    		
    		int result=floor*100+room;
    		bf.append(result+"\n");
    	}
    	
    	bw.write(bf.toString());
    	bw.flush(); bw.close();
    	
    }
}
