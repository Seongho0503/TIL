import java.io.*;
import java.util.*;

public class Main {
	
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int[] visit;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i <= N; i++)
			list.add(new ArrayList<>());
		
		visit = new int[N+1];
		
		for(int i = 0; i < N -1 ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		for(int i = 1; i <= N; i++) {		
			if(visit[i] == 0) {
				dfs(i, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i <= N; i++) {
			sb.append(visit[i]).append('\n');
		}
		
		System.out.print(sb);
	}
	
	static void dfs (int cur, int pre) {
		
		visit[cur] = pre;
		
		ArrayList<Integer> node = list.get(cur);
		for(int i = 0; i < node.size(); i++) {
			
			int next = node.get(i);
			
			if(visit[next] == 0) dfs(next, cur);	
		}	
	}
}
