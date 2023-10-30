//package BOJ_11000_골5_강의실배정;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] classes = new int[N][2]; 
		
		StringTokenizer st; 
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			classes[i][0] = Integer.parseInt(st.nextToken());
			classes[i][1] = Integer.parseInt(st.nextToken());
		} // 입력 끝
		
		// 시작 -> 끝 오름차순 정렬 
		// 시작 시간 오름차순(1순위) -> 끝 시간 오름차순 (2순위)
		Arrays.sort(classes, (o1, o2) -> {
			if(o1[0] == o2[0]) return o1[1] - o2[1]; // 끝 시간 비교 
			return o1[0] - o2[0]; // 시작 시간 비교
		});
		
		// 우선순위큐로 end 시간 오름차순 정렬 
		// 배열을 순회하면서 큐의 end와 같거나 빠르면 그 시간의 end로 바꿔넣음 
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(classes[0][1]);
		
		for(int i = 1; i < N; i++) {
			
			if(!pq.isEmpty() && classes[i][0] >= pq.peek()) {
				pq.poll();
			}
			pq.add(classes[i][1]);
		}
		
		// 마지막에 남아있는 개수 = 강의실 개수
		System.out.print(pq.size());
	}

}
