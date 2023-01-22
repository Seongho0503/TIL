import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		// 배열 초기화
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 순차 정렬 할 때 0인덱스 확인 잘하기 (배열크기랑), 배열크기 1크게 잡으면 인덱스 변화시켜야함
		Arrays.sort(arr);
		// start, end 투 포인터가 양 끝에서 시작
		int start = 0;
		int end = N-1;
		int count = 0;
		int sum = arr[start] + arr[end];
		// 재료는 고유한 번호이기 때문에 똑같은 번호 불가
		while( start < end) {
			if(sum == num) { // start , end 둘 다 변화
				end--;
				start++;
				count++;
				
			}else if (sum < num) { // 값이 더 커져야 되는 상황 -> start 인덱스 증가
				start++;
			}else { // sum > num 값 더 줄여야 되는 상황 -> end 인덱스 감소
				end--;
			}
			sum = arr[start] + arr[end]; // sum 갱신
		}
		System.out.println(count);
		br.close();
	}
}