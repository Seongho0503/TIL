

import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) que.add(num);
			else {
				// ullPointerException
				int check = que.size();
				int input = check == 0 ? 0 : que.poll();
				sb.append(input).append('\n');
			}
			
		}
		System.out.print(sb);
		
	}
}
