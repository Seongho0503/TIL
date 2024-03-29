import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringBuilder sb = new StringBuilder();
		 int n = Integer.parseInt(br.readLine());
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 int[] arr = new int[n];
		 
		 for(int i = 0; i < n ; i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 Arrays.sort(arr);
		 sb.append(arr[0] + " ");
		 
		 for(int j = 0; j < n-1; j++) {
			 if(arr[j] != arr[j+1]) {
				 sb.append(arr[j+1] + " ");
			 }
		 }
		System.out.print(sb);
	}

}
