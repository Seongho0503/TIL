

import java.io.*;
import java.util.*;

// 중복 순열
public class Main {
	
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();;
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			// 배열 : 순서 중요 (순열)
			// 숫자가  더해지지 않게 하기 위해 배열을 만들었다
			arr = new int[N];
			dfs(0);
			System.out.println(sb);
				
	}
	// 글자 자리수가 depth임
	public static void dfs(int depth) {
		
		// 해당 자리수가 도달하면 종료 (백트래킹)
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append('\n');
			return;
		}
		
		// 중복 가능
		// 0은 앞에 못들어감
		for(int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
		
	}

}
