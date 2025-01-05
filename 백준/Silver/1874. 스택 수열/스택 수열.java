
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc=new Scanner(System.in);
    	
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=sc.nextInt();
    	}
    	
    	// 스택 수열 만들기
    	Stack<Integer> stack=new Stack<>();
    	StringBuffer bf=new StringBuffer();
    	
    	int num=1; boolean result=true;
    	
    	for(int i=0;i<arr.length;i++) {
    		int a=arr[i];
    		
    		if(a>=num) {
    			while(a>=num) {
    				stack.push(num++);
    				bf.append("+\n");
    			}
    			stack.pop();
    			bf.append("-\n");
    		}else {
    			int peek=stack.pop();
    			
    			if(peek>a) {
    				System.out.println("NO");
    				result=false;
    				break;
    			}else {
    				bf.append("-\n");
    			}
    		}
    	}
    	if(result) {
    		System.out.println(bf.toString());
    	}
    	
    	
    }
       
}
