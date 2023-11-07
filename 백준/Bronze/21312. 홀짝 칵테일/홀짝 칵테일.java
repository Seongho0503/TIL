//package BOJ_21312_브3_홀짝칵테일;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] coke = new int[3];
		
		for(int i = 0; i < 3; i++) {
			coke[i] = Integer.parseInt(st.nextToken());
		}
		
		int OddSum = 1; // 홀수
		int evenSum = 1; // 짝수
		boolean isOdd = false;
		for(int i = 0; i < 3; i++) {
			
			if(coke[i] % 2 == 1) {
				OddSum *= coke[i];
				isOdd = true;
			}
			
			evenSum *= coke[i];
		}
		
		System.out.println(isOdd ? OddSum : evenSum);
		
	}

}
