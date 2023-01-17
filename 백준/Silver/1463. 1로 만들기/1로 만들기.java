import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int num, count, min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		min = Integer.MAX_VALUE;
		dfs(num, 0);
		System.out.println(min);
	}
	private static void dfs(int k, int count) {
		// 기저 조건
		if(k==1) {
			min = min > count ? count : min;
			return;
		}
		
		// 백트래킹 (가지치기)
		if(min <= count ) return;
		
		//System.out.println("k :" +k); 디버깅
		
		// 최소 값 조합은 count로 관리
		if(k%3==0) dfs(k/3, count+1);
		if(k%2==0) dfs(k/2, count+1);
		dfs(k-1, count+1);	
	
	}
}