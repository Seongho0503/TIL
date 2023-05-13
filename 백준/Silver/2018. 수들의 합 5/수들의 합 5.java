import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  int N = Integer.parseInt(br.readLine());
	  
	  int start = 1;
	  int end = 1;
	  int sum = start;
	  int cnt = 0;
	  while(start <= N) {
		  //System.out.println(sum);
		  if(sum == N) cnt++;
		  if(sum < N) {
			  end++;
			  sum += end;
		  }else {
			  sum -= start;
			  start++;
		  }  
	  }
	  
	  System.out.println(cnt);
		
	}
}
