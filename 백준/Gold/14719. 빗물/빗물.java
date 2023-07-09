
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int height[] = new int[m]; 
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		// 처음과 마지막은 빗물 못 고임
		for(int i = 1; i < m-1; i++) {
			
			int left = 0;
			int right = 0;
			
			// 왼쪽 기둥
			for(int j = 0; j < i; j++) {
				left = Math.max(height[j], left);
			}
			
			// 오르쪽 기둥
			for(int j = i + 1; j < m; j++) {
				right = Math.max(height[j], right);
			}
			
			if(height[i] < right && height[i] < left) {
				sum += Math.min(left, right) - height[i];
			}
			
		}
		System.out.print(sum);
	}

}
