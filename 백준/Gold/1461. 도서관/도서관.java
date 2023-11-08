//package BOJ_1461_골5_도서관;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> plus = new ArrayList<>();
		ArrayList<Integer> minus = new ArrayList<>();
		
		int max = 0;
		String[] input = br.readLine().split(" ");
		for(int i = 0; i < input.length; i++) {
			
			int num = Integer.parseInt(input[i]);
			max = Math.max(max, Math.abs(num)); // 최고 먼 거리
			if(num > 0) {
				plus.add(num);
			}else {
				minus.add(Math.abs(num));
			}
		}
		
		Collections.sort(plus, Collections.reverseOrder());
		Collections.sort(minus, Collections.reverseOrder());
		
		int answer = 0; // 총 거리
		
		// plus 거리 계산
		for(int i = 0; i < plus.size(); i++) {
			if( i % M == 0 && plus.get(i) == max) {
				answer += plus.get(i);
			}else if(i % M == 0) {
				answer += (plus.get(i) * 2);
			}
		}
		
		
		// minus 거리 계산
		for(int i = 0; i < minus.size(); i++) {
			if( i % M == 0 && minus.get(i) == max) {
				answer += minus.get(i);
			}else if(i % M == 0) {
				answer += (minus.get(i) * 2);
			}
		}
		
		System.out.println(answer);
		
	}

}
