
import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		visit = new int[N+1];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i <= N; i++)
			list.add(new ArrayList());
	
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
			// 단방향 그래프다! 문제 잘 읽자!
			//list.get(b).add(a);
		}
		
		bfs(start,1);
		
		boolean check = false;
		for(int j = 1; j <= N; j++ ) {
			if(visit[j] == K+1) {
				check = true;
				System.out.println(j);
			}
		}
		
		if(!check) System.out.println(-1);

	}
	
	static void bfs(int city, int dep) {
		
		Queue<Integer> que = new LinkedList<>();
		
		que.add(city);
		que.add(dep);
		visit[city] = dep;
		
		while(que.size()>0) {
			
			int num = que.poll();
			int depth = que.poll();
			ArrayList<Integer> node = list.get(num);
			
			for(int i = 0; i < node.size(); i++) {
				
				int next = node.get(i);
				
				if(visit[next] == 0) {
					
					visit[next] = depth + 1;
					que.add(next);
					que.add(depth + 1);
				}
			}
		}
		
	}
}
