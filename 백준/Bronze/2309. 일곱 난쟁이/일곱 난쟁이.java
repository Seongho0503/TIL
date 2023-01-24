import java.util.*;
import java.io.*;

public class Main {
	static int sum =0;
	static int[] arr;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		// 순차 정렬
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// dfs는 flag로 백트레킹, 난쟁이 키는 다 달라서 인덱스가 겹칠 수 없음
				if(!flag &&i!=j) dfs(i, j);
			}
		}
	}
	private static void dfs(int idx1, int idx2) {
		int count = arr[idx1] + arr[idx2];
		StringBuilder st = new StringBuilder();
		if(sum-count==100) {
			for(int person : arr) {
				if(person!=arr[idx1] && person!=arr[idx2]) st.append(person).append("\n");
			}
			System.out.print(st);
			flag = true;
		}
	}
}
