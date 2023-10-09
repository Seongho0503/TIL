//package BOJ_실3_1966_프린터큐;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < tc; t++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			
			int n = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> que = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < n; i++) {
				que.add(new int[] {i, Integer.parseInt(st.nextToken())}); // {원래 위치, 중요도}
			}
		  
		  int count = 0;
		  while(!que.isEmpty()) {
			
			boolean isMax = true;
			int[] front = que.poll();
			  
			for(int i = 0; i < que.size(); i++) {
					
				if(front[1] < que.get(i)[1]) {
				// 맨 앞 프린트보다 중요도가 더 높은 프린터가 있을 때
					que.offer(front);
					for(int j = 0; j < i; j++) {
						que.offer(que.poll());
					}
					
					isMax = false;
					break;
				}	
			}
			// front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
			if(isMax == false) {
				continue;
			}
			
			count++;
			if(front[0] == target) {
				break;
			}
		  }// while 종료
		  
		  sb.append(count).append('\n');
		  
		}//tc 종료
		System.out.println(sb);
	}

}
