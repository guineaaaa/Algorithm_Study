import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        // 입력 값을 저장할 배열
        int [] arr=new int[5];
        
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        // 나누어 떨어지는지 확인할 변수
        int count=0;
        
        // 결과값 저장
        int N=0;
        
        while(true){
            N++; 
            for(int i=0;i<5;i++){
                if((N>=arr[i])&&(N%arr[i]==0)){count++;}
            }
            if(count>=3){break;}
            count=0;
        }
        System.out.println(N);
        
    }
}