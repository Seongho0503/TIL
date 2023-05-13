import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//// 순차 정렬 할 때 0인덱스 확인 잘하기 (배열크기랑), 배열크기 1크게 잡으면 인덱스 변화시켜야함
		Arrays.sort(arr);
		
		int start = 0;
		int end = N-1;
		int cnt = 0;
		
		// start가 end랑 같아도 안 됨 (재료는 고유 번호 = 서로 다른 번호) 
		while(start < end) {
			int sum = arr[start] + arr[end];
			if(sum == M) { // start , end 둘 다 변화
				start++;
				end--;
				cnt++;
			// 값이 더 커져야 되는 상황 -> start 인덱스 증가
			}else if(sum < M) {
				start++;
			// sum > num 값 더 줄여야 되는 상황 -> end 인덱스 감소
			}else {
				end--;
			}
		}
		System.out.println(cnt);
	}

}