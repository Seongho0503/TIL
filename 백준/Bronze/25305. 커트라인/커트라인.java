

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int cut_num = Integer.parseInt(st.nextToken());
		int cut_line = 0;
		int count = 0;
		
		
		st = new StringTokenizer(br.readLine());
		int[] scores = new int[N];
		for(int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());

		}
		
		Arrays.sort(scores);
		
		for(int i = scores.length-1; i >= 0; i--) {
			count++;
			if(cut_num == count) {
				cut_line = scores[i];
			}
		}
		
		System.out.print(cut_line);
		
		
	}
}
