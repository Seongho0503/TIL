
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] ans = new int[1002][4];
	static int[][] rgb = new int[1002][4];
	static int R = 1;
	static int G = 2;
	static int B = 3;
	// 10Àº 3
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		for (int i = 1; i <= input; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = R; j <= B; j++) {
				rgb[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		//ÃÊ±âÈ­
		for (int i = 1; i <= input; i++) {
			for (int j = R; j <= 3; j++) {
				ans[i][j] = 999999999;
			}
		}
		ans[1][R] = rgb[1][R];  // rgb[2][R]  rgb[3][R] // ans[2][R] ans[3][R]=>  
		ans[1][G] = rgb[1][G];  // rgb[2][G]  rgb[3][G] // ans[2][G] ans[3][G]=>
		ans[1][B] = rgb[1][B];  // rgb[2][B]  rgb[3][B] // ans[2][B] ans[3][B]=>
		for (int i = 2; i <= input; i++) {
			for (int j = R; j <= B; j++) {
				for (int k = R; k <= B; k++) {
					if (j != k) {
						ans[i][j] = min(ans[i][j], rgb[i][j] + ans[i-1][k]);
					}
				}
			}
		}
		System.out.println(min(ans[input][R], ans[input][G], ans[input][B]));
	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else 
				return c;
		}
		else {
			if (b < c)
				return b;
			else
				return c;
		}
	}
}