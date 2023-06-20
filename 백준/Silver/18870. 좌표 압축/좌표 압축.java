import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int[] arrSort = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			nums[i] = arrSort[i] = Integer.parseInt(st.nextToken());
		}
			
		Arrays.sort(arrSort);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int rank = 0;
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(arrSort[i])) {
				// val에 i를 넣으면 0 3 5 10 이렇게 등수가 나올 수 있다
				map.put(arrSort[i], rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(map.get(nums[i])).append(' ');
		}
		
		System.out.print(sb);
	}
	
}
