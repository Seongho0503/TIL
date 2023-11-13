import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int M, N;
	public static int[][] map;
	public static int[][] memo;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		memo = new int[M][N];
		
		for (int i = 0; i < M; ++i) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 0; j < N; ++j) {
				map[i][j] = Integer.parseInt(st.nextToken());
				memo[i][j] = -1;
			}
		}
		
		go(0, 0);
		
		System.out.println(memo[0][0]);
	}
	
	public static int[] dy = {-1, 0, 1, 0};
	public static int[] dx = {0, -1, 0, 1};
	public static int go(int y, int x) {
		
       // 목적지 도착
       if (y == M - 1 && x == N - 1) {
			return 1;
		}
		
		if (memo[y][x] != -1) {
			return memo[y][x];
		}

		memo[y][x] = 0;
		
		for (int dir = 0; dir < 4; ++dir) {
			int ny = y + dy[dir];
			int nx = x + dx[dir];
			
			if (ny < 0 || nx < 0 || ny >= M || nx >= N) {
				continue;
			}
			
			// 현재보다 작은 수만 탐방
			if (map[ny][nx] < map[y][x]) {
				// 앞으로 갈 경로들의 도착지 도착횟수를 모두 구해 저장한다.
				memo[y][x] += go(ny, nx);
			}
		}
		
		return memo[y][x];
	}
}