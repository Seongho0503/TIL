import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		visited = new boolean[N];
		// 리스트 초기화
		list = new ArrayList[N];
		// 리스트 할당
		for (int j = 0; j < N; j++) {
			list[j] = new ArrayList<Integer>();
		}
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);	
			list[b].add(a);
		}
		
		for (int i = 0; i < N; i++) {
			if(!flag && !visited[i]) {
				dfs(i, 0);		
			}
		}
		System.out.println(flag==true ? "1" : "0");
	}

	private static void dfs(int cur, int depth) {
	
		// 깊이 4번 이동 : 종료 조건
		if(depth==4) {
			flag = true;
			return;
		}
		// 방문 체크
		visited[cur] = true;
		
		// 현재 노드 번호의 연결된 노드 가져오기
		for(int node : list[cur]) {
			if(!visited[node]) {
				// dfs -> 그래프 너비 증가 -> count++
				dfs(node, depth+1);
			}
		}
		visited[cur] = false;
	}
}