//package BOJ_실4_2578_빙고;

import java.io.*;
import java.util.*;

public class Main {
	static int[][] map;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		map = new int[6][6];
		
		for(int i = 1; i <= 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int cnt = 0;
		
		for(int i = 1; i <= 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 5; j++) {
				int num = Integer.parseInt(st.nextToken());
				check(num);
				cnt++;
				if(cnt >= 1) {
					int isbingo = bingo();
					if(isbingo >= 3) {
						System.out.println(cnt);
//						for(int k = 1; k <= 5; k++) {
//							for(int p = 1; p <= 5; p++) {
//								System.out.printf("%3d", map[k][p]);
//							}
//							System.out.println();
//						}
						return;
					}
				}
			}
		}
		
	}

	static void check (int a) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(map[i][j] == a) map[i][j] = 0;
			}
		}
	}
	
	static int bingo() {
		int count = 0;
		// 가로
		for(int i = 1; i <= 5; i++) {
			int sumRow = 0;
			for(int j = 1; j <= 5; j++) {
				sumRow += map[i][j];
			}
			if(sumRow == 0) count++;
		}
		// 세로
		for(int i = 1; i <= 5; i++) {
			int sumCol = 0;
			for(int j = 1; j <= 5; j++) {
				sumCol += map[j][i];
			}
			if(sumCol == 0) count++;
		}
		
		if(map[1][1] + map[2][2] + map[3][3] + map[4][4] + map[5][5] ==0) count++;
		if(map[5][1] + map[4][2] + map[3][3] + map[2][4] + map[1][5] ==0) count++;
		
		return count;
	}
}
