import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		for (int i = 0; i < N; i++) {
			// char -> Int 
			int num = str.charAt(i)-'0';
			sum += num;
		}
		System.out.println(sum);
	}
}
