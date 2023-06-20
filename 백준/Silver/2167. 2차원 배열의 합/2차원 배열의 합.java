import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());  
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			//int sum = (x2 * y2) - (x2-x1)*y2 + (y2-y1)*x2 - x1*y1;
			int sum = 0;
			for(int i = x1; i <= x2; i++) {
				for(int j = y1; j <= y2; j++) {
					sum += arr[i-1][j-1];
				}
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}
