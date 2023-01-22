import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N+1];
		// 배열 요소 1부터 초기화
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}
		// 자기 자신
		int count = 1;
		int end = 1;
		int start = 1;
		//1부터 시작 (1인덱스 값이 1)
		int sum =1;
		// 뒤의 인덱스가 N이랑 같아진다면 끝까지 탐색한 것
		while(end != N) {
			// 현재 연속 합이 N과 같은 경우
			if(sum == N) {
				count++;
				end++;
				sum += arr[end];
			}else if(sum < N) { // 현재 연속 합이 N보다 작은 경우
				end++;
				sum += arr[end];
			}else {//sum > N // 현재 연속 합이 N보다 큰 경우
				sum -= arr[start];
				start++;
			}		
		}
		System.out.println(count);
	}
}