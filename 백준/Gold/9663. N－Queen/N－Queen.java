
import java.io.*;
import java.util.*;

public class Main {
	static int count = 0;
	static int[] map;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N];
		dfs(0);
		System.out.print(count);
	}
	
	public static void dfs(int depth) {
		
		if(depth == N) {
			count++;
			return;
		}
		
		for(int i = 0; i < N; i++) {	
			map[depth] = i;
			if(isPossible(depth)) {
				dfs(depth + 1);
			}
		}
	}
	
	public static boolean isPossible(int col) {
		
		// 이전 열과 현재 열을 비교 [같은 행에 있는지를 확인]
		// 첫번째 열에 처음 놓을 때 조건 만족 못하니깐 무조건 놓을 수 있다.
		for(int i = 0; i < col; i++) {
			if(map[col] == map[i]) {
				return false;
			
			// 대각선 에 있는 경우
			}else if (Math.abs(i- col) == Math.abs(map[i]-map[col])) {
				return false;
			}
		}
	return true;
	}
}