

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] points = new int[N][2];
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			points[i][0] = Integer.parseInt(st.nextToken());
			points[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(points, (e1,e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0]-e2[0];
			}
			else {
				return e1[1]-e2[1];
			}
			
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(points[i][0] + " " + points[i][1]);
		}
		
	}
}
