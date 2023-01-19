import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int[] nums = new int[N+1];
		int[] sums = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) { // 1부터 처리하면 0인덱스의 i-1을 따로 처리 안해도 됨
			nums[i] = Integer.parseInt(st.nextToken());
			// 구간합 공식 = 이전까지의 누적합 + 현재 값
			sums[i] = sums[i-1] + nums[i];
		}
		
		// 해당 범위의 구간합 구하기
		int sum;
		for (int i = 1; i <= count; i++) {
			st = new StringTokenizer(br.readLine());
			int idx1 = Integer.parseInt(st.nextToken());
			int idx2 = Integer.parseInt(st.nextToken());
			// 해당 범위의 구간합 = 해당 범위 마지막 인덱스 구간합 - 시작부붙 전의 인덱스 
			sum = sums[idx2] - sums[idx1-1];
			System.out.println(sum);
		}	
	}
}
