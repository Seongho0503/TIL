import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int max = a > b ? a : b;
		// 최대 공약수
		while(max > 0) {
			if(a%max==0 && b%max == 0) break;
			max--;
		}
		// 최소 공배수
		int min = max * (a/max) * (b/max);
		System.out.println(max);
		System.out.println(min);
	}
}