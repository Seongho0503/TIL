//package BOJ_9489_골5_사촌;

/*
 * 두 노드의 부모는 다지만, 두 부모가 형제(sibling)일 때 두 노드를 사촌
 * 이전 노드와 현 노드의 값의 차이가 1이 아니면 부모 노드 인덱스(parentIdx) 증가
 */

import java.io.*;
import java.util.*;

public class Main {
	
	static int targetIdx = 0;
	static int[] data, parrent;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		String input = br.readLine();
		if(input.equals("0 0")) break; // 종료 (st는 주소 값 찍힘)
		
		st= new StringTokenizer(input);
		int N = Integer.parseInt(st.nextToken()); // 노드의 수 
		int target = Integer.parseInt(st.nextToken()); // 사촌 번호
		
		data = new int[N+1]; // 노드 번호
		parrent = new int[N+1]; // 부모 정보
		parrent[0] = -1; // 루트 노드
		st = new StringTokenizer(br.readLine());
		 
		int parentIdx = 0; // 레벨 정보
		
		// level 구분하기
		for(int i = 1; i <= N; i++) {
 			data[i] = Integer.parseInt(st.nextToken());
 			if(data[i] == target) targetIdx = i;
			if(i > 1 && data[i] - data[i-1] != 1) parentIdx++;
			
			parrent[i] = parentIdx;
			//tree[parentIdx].add(num);
		}
		
		// 부모가 다른 리프노드 찾기
		int cnt = 0;
        for(int i = 1; i <= N; i++) { // 부모 노드가 같지 않고, 부모 노드가 형제인 경우
            if(parrent[i] != parrent[targetIdx] && parrent[parrent[i]] == parrent[parrent[targetIdx]]) cnt += 1;
        }
        
        sb.append(cnt).append("\n");
		}
		 System.out.println(sb);
	}

}
