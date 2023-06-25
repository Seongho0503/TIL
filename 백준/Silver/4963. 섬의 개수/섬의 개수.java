

import java.io.*;
import java.util.*;

public class Main {

	static int w,h;
	static int map[][];
	static int dx[] = {0,0,-1,1,-1,-1,1,1};
	static int dy[] = {-1,1,0,0,-1,1,-1,1}; //8방향 탐색
	static boolean Visited[][];
	static int island = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w ==0 && h == 0)
				break;
			
			map = new int[h][w];
			Visited = new boolean[h][w];
			island = 0 ;// 섬 갯수 초기화
			
			for(int i=0;i<h;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<w;j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}//지도 입력
			
			/*for(int i=0;i<w;i++)
				System.out.println(Arrays.toString(map[i])); //지도 확인
*/
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(map[i][j] == 1 && !Visited[i][j]) {
						//섬이면 dfs로 섬 찾기
						Visited[i][j] = true;
						dfs(i,j);  
						island++;
					}
				}
			}
			
			System.out.println(island);

		}
	}
	
	static void dfs(int row,int col) {
		
		for(int d=0;d<8;d++) {
			int nx = row + dx[d];
			int ny = col + dy[d];
			
			if(nx<0 || nx>=h || ny<0 || ny>=w || map[nx][ny] ==0 || Visited[nx][ny]) continue; //배열 범위 벗어나면 그만두기
			
			//방문하지도 않았고 섬이면
			Visited[nx][ny] = true;
			//System.out.println("현재 섬은 방문하였습니다. ("+nx+","+ny+")");
			dfs(nx,ny);
		}
		return;
	}

}