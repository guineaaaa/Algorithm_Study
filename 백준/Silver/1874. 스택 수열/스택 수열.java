
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int A[]=new int[N];

        for(int i=0;i<A.length;i++) {
            A[i]=sc.nextInt();
        }

        Stack<Integer> stack=new Stack<>();
        StringBuffer bf=new StringBuffer();

        int num=1; boolean result=true;

        for(int i=0;i<A.length;i++) {
            int n=A[i];

            if(n>=num) {
                while(n>=num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else {
                int p=stack.pop();

                // 스택의 가장 위 수가 만들어야 하는 수열의 수 보다 크다면 수열 출력 불가
                if(p>n) {
                    result=false;
                    System.out.println("NO");
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }
        }

        if(result) {
        System.out.println(bf.toString());
        }
    }

}