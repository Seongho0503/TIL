import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * - 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문 => 인접 행렬로 풀어야 한다. (인접리스트는 순서 보장 못해서 정렬해야함)
 * 
 */

public class Main {
	static int[][] arr;
	static boolean[] visited; 
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		sb = new StringBuilder();
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int from = Integer.parseInt(st.nextToken()); 
			arr[start][from] = 1;
			arr[from][start] = 1;
		}
		
		dfs(target);
		
		sb.append("\n");
		
		visited = new boolean[n+1];
		bfs(target);
		System.out.print(sb);
	}
	private static void dfs(int target) {
		visited[target] = true;
		sb.append(target + " ");
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[target][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int target) {
		Queue<Integer> que = new LinkedList<Integer>(); 
		
		que.add(target);
		visited[target] = true;
		sb.append(target + " ");
		
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int i = 0; i < arr.length; i++) {
				if(arr[now][i] == 1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					sb.append(i + " ");
				}
			}
		}
		
	}	
}
