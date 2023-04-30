import java.util.*;
import java.io.*;

public class Main {
	static int [] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int [N];
		for(int i =0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int tc = 0; tc < T; tc++) {
			
			int num = Integer.parseInt(st.nextToken());
			if(binarySearch(num) >= 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
	
	public static int binarySearch(int key) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			
			int mid = (start+end) / 2;
			
			if(key < arr[mid]) {
				end = mid -1;
			}
			else if(key > arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
}