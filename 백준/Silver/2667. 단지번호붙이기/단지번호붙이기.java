import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int count;
	static boolean[][] visited;
	static int[][] map;
	static int[][] dirs = {{1,0},{-1,0},{0,1}, {0,-1}};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				if(str.charAt(j) == '1') {
					map[i][j] = 1;
				}
			}
		}
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			for(int j =0; j < N; j++) {
				if(map[i][j] == 1 && visited[i][j] == false) {
					count = 0;
					dfs(i,j);
					list.add(count);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	static void dfs(int i, int j) {
		count++; // 방향 이동 횟수
		visited[i][j] = true; // 들어오자 마자 방문체크 해야함 이것을 dfs밑에 넣어서 틀렸음
		for(int k = 0; k < 4; k++) {
			int nx = j + dirs[k][1];
			int ny = i + dirs[k][0];
			if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
			if(map[ny][nx] == 0 || visited[ny][nx] == true) continue;
			dfs(ny,nx);
		}
	}
}
