import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N+1];
		
		for(int i = 0; i <= N; i++)
			list.add(new ArrayList<>());
		
		for(int i = 0; i < M; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// 양방향
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		int count = 0;
		for(int i = 1; i <= N; i++) {
			
			if(!visit[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.print(count);
	}
	
	public static void dfs(int cur) {
		
		visit[cur] = true;
		
		ArrayList<Integer> node = list.get(cur);
		
		for(int i = 0; i < node.size(); i++) {
			int next = node.get(i);
			if(!visit[next]) dfs(next);
		}
	}
}
