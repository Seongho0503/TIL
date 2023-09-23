//package BOJ_2529_실1_부등호;

import java.util.*;
import java.io.*;

 
public class Main {

	static int n;
	static boolean[] visited;
	static String[] arr;
	static List<String> list = new ArrayList<>();
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = br.readLine().split(" ");

		visited = new boolean[10];
		
		// param1 : 리턴받을 문자열, param2: 인덱스(0부터시작)
		dfs("",0);

		//최대값
		System.out.print(list.get(list.size() - 1) + "\n");
		//최소값
		System.out.print(list.get(0));
		
	}
	
	static void dfs(String num, int depth) {
		// 주어진 부등호의 모든 조건을 완성하면 리턴
		if(depth == n+1) {
			// 부등호가 성립되는 모든 경우의 수가 등록됨
			list.add(num);
			return;
		}

		// 0~9 까지의 수
		for(int j = 0 ; j < 10; j++) {
			// 사용한 숫자인지 체크
			if(!visited[j]) {
				
			// Character.getNumericValue : char -> int 형으로 변환 (선택한 숫자)
			// j , arr[idx-1] : 선택한 숫자에 비교할 숫자와, 비교할 부등호
			if(depth == 0 || ckeck(num.charAt(depth - 1) - '0', j , arr[depth-1])) {
				visited[j] = true;
				// true일시, num에 문자열 붙임
				dfs(num+j, depth+1);
				visited[j] = false;				
				}
			}
		}
	}// dfs 종료
	
	static boolean ckeck(int a, int b, String c) {
		// 현재 사용하는 숫자와 j번째 숫자와 비교하여, 부등호가 성립되면 true
		if (c.equals(">")) {
			if(a < b) return false;
		} else if (c.equals("<")){
			if(a > b) return false;
		}
		return true;
	}

}
