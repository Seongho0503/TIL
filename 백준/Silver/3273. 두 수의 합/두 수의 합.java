import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int N = Integer.parseInt(br.readLine());
	  int [] arr = new int[N];
	  StringTokenizer st = new StringTokenizer(br.readLine());
	  
	  // 배열 초기화
	  for (int i = 0; i < N; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	  }
	  
	  int target = Integer.parseInt(br.readLine());
	  // 정렬 : 투 포인터 규칙 세우기 위해서
	  Arrays.sort(arr);
	  int i =0, j =N-1;    // i : start , j : end
	  int count=0;
	  // i++ : 앞의 인덱스 뒤로(값 증가) , j-- : 뒤의 인덱스 앞으로 (값 감소)
	  while(i < j) {
		  if(arr[i] + arr[j] == target) { // i, j 둘 다 변화 시켜야 함
			  count++;
			  i++;
			  j--;
		  }else if( arr[i] + arr[j] > target) { // 값 줄여야 함
			  j--;
		  }else {  //arr[i] + arr[j] < target 값 증가해야 함
 			  i++;
		  }
	  }
	  System.out.println(count);
	}
}
