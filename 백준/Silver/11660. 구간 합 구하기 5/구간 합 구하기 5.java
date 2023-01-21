import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int sum;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken()); // 표의 크기 
	int M = Integer.parseInt(st.nextToken()); //구하는 횟수
	
	// 0번 인덱스를 비우면서 예외처리를 쉽게 하기 위해서
	int[][] map = new int[N+1][N+1];
	int[][] sums = new int[N+1][N+1];
	// 배열 담기
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				// (1,1)부터 초기화
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	// 배열 요소 누적합 초기화
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sums[i][j] = sums[i][j-1] + sums[i-1][j] - sums[i-1][j-1] + map[i][j];
			}
		}
		
		 StringBuilder sb = new StringBuilder();
		// 사각형 누적합 계산
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 =  Integer.parseInt(st.nextToken()); //x1
			int y1 =  Integer.parseInt(st.nextToken()); //y1
			int x2 =  Integer.parseInt(st.nextToken()); //x2
			int y2 =  Integer.parseInt(st.nextToken()); //y2
			
			sum = sums[x2][y2] - sums[x1-1][y2] - sums[x2][y1-1] + sums[x1-1][y1-1];
			sb.append(sum).append('\n');
		}	
		System.out.println(sb);;
	}
}
