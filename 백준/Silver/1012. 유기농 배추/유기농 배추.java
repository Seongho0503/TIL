import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int M, N, count, sum;
	static boolean[][] map;
	static boolean[][] visited; 
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0 , -1, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	


		for(int tc =0; tc<T; tc++ ) {
			// 맵 초기화
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken()); // 가로
			N = Integer.parseInt(st.nextToken()); // 세로
			count = Integer.parseInt(st.nextToken()); // 배수 총합
			map = new boolean[N][M];
			visited = new boolean[N][M];
			sum = 0;
			// 배추 입력
			for(int i =0; i < count; i++) {
				st = new StringTokenizer(br.readLine());
				int row = Integer.parseInt(st.nextToken()); // 가로
				int col = Integer.parseInt(st.nextToken()); // 세로
				//System.out.println("row : " + row +" col : " + col);
				map[col][row] = true;
			}
			
			// 모든 지점마다 dfs
			for(int i = 0; i< N; i++) {
				for(int j =0; j <M; j++) {
					// 배추있는데 아직 방문 안했으면
					if(!visited[i][j] && map[i][j]) {
						//System.out.println(" i :" + i + " j :" + j +" sum :" + sum);
						sum++;
						dfs(i,j);
					}
				}
			}
				
		System.out.println(sum);		
		} // tc 종료
	}
	private static void dfs(int y, int x) {
	//System.out.println("y :" + y + " x : " +x);
	visited[y][x] =true;

		for(int k =0 ; k< dx.length; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if(nx<0 || ny <0 || nx>=M || ny>=N) continue; // 경계값 체크
			if(!map[ny][nx]) continue;
			if(visited[ny][nx]) continue; // 방문체크 
			dfs(ny, nx);
		}
		
	}
}