import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static ArrayList<Integer> A[];
	
	static boolean DFSvisited[];
	static boolean BFSvisited[];
	
	static int BFSres[];
	static int DFSres[];
	
	static StringBuilder DFSorder;
	static StringBuilder BFSorder;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken()); // 정점의 개수 N
    	int M=Integer.parseInt(st.nextToken()); // 간선의 개수 M
    	int V=Integer.parseInt(st.nextToken()); // 탐색 시작 정점 번호
    	
    	A=new ArrayList[N+1];
    	DFSres=new int[N+1];
    	BFSres=new int[N+1];
    	
    	DFSvisited=new boolean[N+1];
    	BFSvisited=new boolean[N+1];
    	
    	for(int i=1;i<=N;i++) {
    		A[i]=new ArrayList<>();
    	}
    	
    	for(int i=1;i<=M;i++) {
    		StringTokenizer st1=new StringTokenizer(br.readLine());
    		int u=Integer.parseInt(st1.nextToken());
    		int v=Integer.parseInt(st1.nextToken());
    		A[u].add(v);
    		A[v].add(u);
    	}
    	
    	for(int i=1;i<=N;i++) {
    		Collections.sort(A[i]);
    	}
        DFSorder = new StringBuilder(); 
        BFSorder = new StringBuilder();
    	
    	DFS(V);
    	BFS(V);
    	
    	bw.write(DFSorder.toString()+"\n");
    	bw.write(BFSorder.toString());


    	bw.flush();
    	bw.close();
    } 
    
    static void DFS(int v) {
    	DFSvisited[v]=true;
    	DFSorder.append(v).append(" ");
    	
    	for(int i:A[v]) {
    		if(!DFSvisited[i]) {
    			DFS(i);
    		}
    	}
    }
    
    static void BFS(int v) {
  
    	Queue<Integer> queue=new LinkedList<>();
    	queue.add(v);
    	BFSvisited[v]=true;
    	BFSorder.append(v).append(" ");
    	
    	// 인접 리스트 탐색
    	while(!queue.isEmpty()) {
    		int node=queue.poll();
    		
    		for(int i:A[node]) {
    			if(!BFSvisited[i]) {
    				queue.add(i);
    				BFSvisited[i]=true;
    				BFSorder.append(i).append(" ");
    			}
    		}
    	}
    }
}
