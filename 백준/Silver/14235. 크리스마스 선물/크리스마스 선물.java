
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int cur = Integer.parseInt(st.nextToken());
			
			// 선물 주기
			if(cur == 0) {
				
				if(pq.size() == 0) sb.append(-1).append('\n');
				else {
					sb.append(pq.poll()).append('\n');
				}
			}else {
				
				for(int j = 0; j < cur; j++) {
					pq.add(Integer.parseInt(st.nextToken()));
				}
			}
		}// 종료
		
		System.out.print(sb);
	}
}
