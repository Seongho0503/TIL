import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][2];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		// 나이가 같으면 순서를 바꾸지 않음 = 처음 입력 순서
		Arrays.sort(arr, (e1,e2) -> {
				int num1 = Integer.parseInt(e1[0]); 
				int num2 = Integer.parseInt(e2[0]);
				return num1-num2;			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
