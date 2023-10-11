//package BOJ_실5_1417_국회의원선거;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int target = Integer.parseInt(br.readLine());
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 1; i < N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		int cnt = 0;
		while(!pq.isEmpty() && target <= pq.peek()) {
			cnt++;
			target++;
			pq.add(pq.poll()-1);
		}
		System.out.print(cnt);
	}

}
