import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int cut_num = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] scores = new int[N];
		for(int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(scores);
		System.out.print(scores[N - cut_num]);
		
		
	}
}
