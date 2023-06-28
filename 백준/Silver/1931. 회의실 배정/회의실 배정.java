import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[N][2];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (e1,e2) -> {
			
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}
			
			return e1[1] - e2[1];
		});
		
		int count = 1;
		int endTime = arr[0][1]; 
		for(int i = 1; i < N; i++) {
			if(arr[i][0] >= endTime) {
				count++; 		
				endTime = arr[i][1];
			}
		}
		System.out.print(count);	
	}
}
