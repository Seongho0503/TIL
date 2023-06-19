

import java.io.*;
import java.util.*;

public class Main {
	static int[] set = { 1, 1, 2, 2, 2, 8};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[6];
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i <6; i++) {
			int num =Integer.parseInt(st.nextToken());
			arr[i] = set[i] - num;
			sb.append(arr[i] +" ");
		}
		
		System.out.print(sb);
		
	}

}
