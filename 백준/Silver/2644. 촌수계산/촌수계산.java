import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int answer = -1, end = -1;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 양방향 인접 리스트
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 전체 사람 수
		visited = new boolean[n+1];
		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++ ) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		
		// 시작 정점 , 촌 수
		dfs(start, 0);
		System.out.println(answer);
	}
	private static void dfs(int start, int cnt) {
		visited[start] = true;
		//System.out.println(Arrays.toString(visited));
		
		for(int x : graph.get(start)) { // 연결된 간선 가져오기
			if(!visited[x]) { // 방문하지 않았으면
				if(x == end) {
					answer = cnt +1;
					return;
				}
				// 다음 촌수로 이동
				dfs(x, cnt+1);
			}
		}
	}
}

/* dfs : 그래프에서 두 노드의 최소 거리
 *  
 *
 * 이 코드 단점은 from, to를 찾고도 계속 더 찾음
 *
 * [false, true, true, false, false, false, false, true, true, true]
 * 
 * 
 * 
 * 
*/