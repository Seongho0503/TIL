import java.io.*;
import java.util.*;

public class Main {

	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] sarr = br.readLine().split(" ");
		N = Integer.parseInt(sarr[0]);
		M = Integer.parseInt(sarr[1]);

		arr = new int[N];

		int max = 0;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
			sum += arr[i];
		}

		System.out.print(Search(max, sum));

	}

	public static int Search(int left, int right) {

		int start = left;
		int end = right;

		while (start <= end){

			int mid = (start + end) / 2;
			int cnt = 1;
			int money = mid;
			for (int i = 0; i < N; i++) {
				if (arr[i] > money) {
					money = mid;
					cnt++;
				}
				money = money - arr[i];
			}

			if (cnt > M)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return start;
	}
}