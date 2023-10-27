//package BOJ_실3_1966_프린터큐;

import java.io.*;
import java.util.*;

public class Main {
	
	static class Print{
		
		int index, val;
		
		public Print(int index, int val){
			this.index = index;
			this.val = val;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			
			LinkedList<Print> list = new LinkedList<>(); 
			PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());
				list.add(new Print(i, num));
				que.add(num);
			}
			int count = 0;
			while(true) {
				
				Print p = list.poll();
				
				if(p.val == que.peek()) {
					que.poll();
					count++;
					if(p.index == target) {
						sb.append(count).append('\n');
						break;
					}				
				}else {
					list.add(p);
				}
			}// while 종료	
		}
		System.out.println(sb);
	}

}
