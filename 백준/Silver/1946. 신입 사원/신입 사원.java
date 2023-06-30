import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int tc = 0; tc < T; tc++) {
			
			int m = Integer.parseInt(br.readLine());
			
			int[][] scores = new int[m][2];
			for(int i = 0; i < m; i++) {
			  	st = new StringTokenizer(br.readLine());
			  	scores[i][0] = Integer.parseInt(st.nextToken()); // 서류
			  	scores[i][1] = Integer.parseInt(st.nextToken()); // 면접
			}// 입력 담기
			
			// 서류순 정렬
			Arrays.sort(scores, (o1,o2) -> {
				return o1[0] - o2[0];
			});
			
			int count = 1;
			int check_score = scores[0][1];
			for(int i = 1; i < m; i++) {
				
				if(scores[i][1] < check_score) {
					count++;
					check_score = scores[i][1];
				}	
			}
			sb.append(count).append('\n');		
		}	
		System.out.print(sb);
	}
}
