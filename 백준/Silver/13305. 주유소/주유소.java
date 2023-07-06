import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] road = new int[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//거리
		for(int i = 0; i < N-1; i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		int[] store = new int[N];
		
		// 충전소
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			store[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int cost = 0; // 총 이동 비용(최저)
		int curPrice = store[0]; // 현재 가격
		int roadSum = 0; // 현재 가격으로 계산할 거리 총합
		for(int i = 0; i < N-1; i++) {
			if(curPrice <= store[i]) {
				roadSum += road[i];
			}else {
				// 이전 거리 계산
				cost += (curPrice * roadSum);
				// 새로운 가격, 거리 갱신
				roadSum = road[i];
				curPrice = store[i];
			}
		}
		// 마지막 거리 계산
		cost += (curPrice * roadSum);
		System.out.print(cost);
	}
}
