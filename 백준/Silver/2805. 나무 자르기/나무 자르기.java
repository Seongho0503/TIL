import java.io.*;
import java.util.*;

public class Main {
	static int max = 0;
	static int N;
	static int[] tree;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		tree = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		int cut = UpBound(M);
		System.out.print(cut-1);
	}
	
	public static int UpBound(int k) {
		
		int min = 0;
		// int count = 0; 에러 원인

		while(min < max) {		
			long count = 0;
			int mid = (min + max) / 2;
			for(int i = 0; i < N; i++) {
				if(tree[i] - mid > 0) {
					count += (tree[i] - mid); 
				}
			}
			if(count < k) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		return min;
	}
}
