
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int T = Integer.parseInt(br.readLine());
		
		// 알파벳 개수 26개
		int[][] arr = new int[s.length()+1][26];
		
		// 처음 dp 알파벳 증가
		arr[1][s.charAt(0) - 'a']++;
		for(int i = 2; i <= s.length(); i++) {
			int idx = s.charAt(i-1) - 'a';
			for(int j = 0; j < 26; j++) {
				int before = arr[i-1][j];
				arr[i][j] = j == idx ? before + 1 : before ; 
			}
			
		}
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = st.nextToken().charAt(0) - 'a';
			int start = Integer.parseInt(st.nextToken()) + 1;
			int end = Integer.parseInt(st.nextToken()) + 1;
			sb.append(arr[end][idx] - arr[start-1][idx] + "\n");
		}	
		System.out.print(sb);
		
	}

}
//seungjaehwang
//4
//a 0 5
//a 0 6
//a 6 10
//a 7 10