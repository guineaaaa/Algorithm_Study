import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
        
        for(int i=0;i<T;i++){
            int R=sc.nextInt();
            
            String S=sc.next();
            // nextLine으로 받으면 공백까지 반복하게 된다..
            
            for(int j=0;j<S.length();j++){
                for(int k=0;k<R;k++){
                    System.out.print(S.charAt(j));
                    // S.charAt(j): 현재 인덱스 j에 해당하는 문자를 가져옴
                    // 'hi' charAt(0): 'h', charAt(1): 'i'
                    // 문자열 S를 R번 반복해서 출력하는 역할
                }
            }
            System.out.println();
        }
    }
}