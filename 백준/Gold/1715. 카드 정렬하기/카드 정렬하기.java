
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		
		for(int i = 0 ; i < N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		int answer = 0;
		
		while(pq.size() > 1) {
		  int n1 = pq.poll();
		  int n2 = pq.poll();
		  answer += n1+n2;
		  pq.add(n1+n2);
		}	
		System.out.print(answer);
		
	}
}
// N = 1일 때는 피연산자가 하나라 연산횟수가 0이 나와야한다.
//사이즈가 1일 때 예외처리
//		if(pq.size() == 1) {
//			answer += pq.poll();
//		}
		