import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // f(n)
        StringTokenizer fn=new StringTokenizer(br.readLine());
        int a1=Integer.parseInt(fn.nextToken());
        int a0=Integer.parseInt(fn.nextToken());
        
        // c
        int c=Integer.parseInt(br.readLine());
        
        // n0
        int n0=Integer.parseInt(br.readLine());

        if((a1*n0+a0)<=c*n0 && a1<=c) {
        	bw.write("1");
        }else {
        	bw.write("0");
        }

        bw.flush();
        bw.close();
        
    }
    
    
}
