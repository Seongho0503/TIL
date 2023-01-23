import java.util.*;
import java.io.*;

public class Main {
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점의 개수
		int T = Integer.parseInt(st.nextToken()); // 간선의 개수
		int count = 0;
		//ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list = new ArrayList<>();
		// 정점이 1부터 시작해서 0번 인덱스 비어줌 (계산 편하게 하기 위해서)
		visited = new boolean[N+1];
		// 각 노드별 리스트를 만들어 줌
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 노드 초기화 방법 a - b 노드 연결
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		// 연결 요소가 다른(그래프가 분리) 된 곳되 있으니 for문으로 탐색
		for (int i = 1; i <= N; i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
	private static void dfs(int cur) {
		// 방문 안 한 노드
		visited[cur] = true;
		// 현재 노드의 연결된 노드 리스트를 가져옴
		ArrayList <Integer> node = list.get(cur);
		// 노드의 size 만큼 돌림
		for (int i = 0; i < node.size(); i++) {
			// 연결된 노드 가져오기
			int next = node.get(i);
			// 방문 안한 노드 번호면 dfs 탐색
			if(!visited[next]) dfs(next);
		}
		
	}
}
