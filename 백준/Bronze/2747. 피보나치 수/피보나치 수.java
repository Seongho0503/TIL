//package BOJ_2747_브2_피보나치수;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int answer = fibo(N);
		
		System.out.println(answer);
	}
	
	static int[] cache = new int[50];
	static int fibo(int n) {
		
		if(n==1 || n==2) return 1;
		if(cache[n] != 0) return cache[n]; 
		
		cache[n] = fibo(n-1) + fibo(n-2);
		return cache[n];
	}

}
