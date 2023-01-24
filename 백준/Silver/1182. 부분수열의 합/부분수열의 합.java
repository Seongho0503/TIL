import java.io.*;
	import java.util.*;

	public class Main {
		static int answer;
		static int N;
		static int count;
		static int[] arr;
		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			N = Integer.parseInt(st.nextToken()); // 정수 개수
			answer = Integer.parseInt(st.nextToken()); // 합
			arr = new int[N];
			st = new StringTokenizer(br.readLine()); 
	 		for (int i = 0; i < arr.length; i++) {
				arr[i] =  Integer.parseInt(st.nextToken());
			}
	 		//Arrays.sort(arr);
	 		dfs(0,0);	
	        if(answer==0) count--; // S가 0이면 공집합(아무 원소도 포함되지 않는 것)을 빼야함 (문제에서 부분수열은 양의 크기만 가능하다 했음)
	 		System.out.println(count);
		}

		private static void dfs(int idx, int sum) {
			if(idx ==N) {
				// 합이 정답과 같을 때 
				if(sum == answer) {
				count++;
				}
				return;
			}
				// 현재 값을 포함 시킬 때 순열
				dfs(idx+1, sum+arr[idx]);
				// 현재 값을 포함 안 시킬 때 순열
				dfs(idx+1, sum);			
		}
	}