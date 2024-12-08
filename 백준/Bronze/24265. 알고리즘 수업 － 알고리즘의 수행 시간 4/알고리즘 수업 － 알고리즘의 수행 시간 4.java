
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Long n=Long.parseLong(br.readLine());
    	
    	/**
    	 * i는 [1,n-1] j는 [i+1,n]만큼 돈다.
    	 * 시간 복잡도: O(n^2)
    	 */
    	
    	System.out.println(n*(n-1)/2);
    	System.out.println(2);
    	
    }
    
    
}
