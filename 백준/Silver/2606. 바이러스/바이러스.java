import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean arr[][];
	static boolean[] visited;
	static int N;
	static int answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int connected = Integer.parseInt(br.readLine());
		// 연결되어있는 것을 알아야 하니깐
		arr = new boolean [N+1][N+1];
		visited = new boolean[N+1];
		StringTokenizer st;
		
		// 1. 그래프 정보 입력
		for (int i = 1; i <= connected; i++) {
			st = new StringTokenizer(br.readLine());	
			int cpu1 = Integer.parseInt(st.nextToken());
			int cpu2 = Integer.parseInt(st.nextToken());
			arr[cpu1][cpu2] = arr[cpu2][cpu1] = true;
		}
		// 2. dfs 및 결과 출력
		dfs(1);
        // 1번 컴퓨터는 문제에서 카운팅 제외하라고 나왔음
		System.out.println(answer-1);		
	}
	private static void dfs(int idx) {
		answer++;
		// 방문 체크
		visited[idx] = true;
		// N대신 arr.length 넣으면 ArrayIndexOutOfBoundsException: 8
		// dfs 방문 탐색
		for (int i = 1; i <= N; i++) {
			// 방문 안 했고 연결되어 있으면 dfs 진행
			if(!visited[i] && arr[idx][i]) {
				dfs(i); 
			}
		}
	}
}
