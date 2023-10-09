//package BOJ_실1_13335_트럭;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> bridge = new LinkedList<>();
		
		for (int i = 0; i < W; i++) { //다리길이만큼 큐에 0 넣어줌 
			bridge.add(0);
		}
		
		int sum = 0; // 현재 다리의 시간, 무게합
		int time = 0;
		
		st = new StringTokenizer(br.readLine());
		int truck = Integer.parseInt(st.nextToken());
	
		while(true) { //더이상 넣을 트럭이 없을때까지 반복 (반복 1번에 시간+1)
			time++; 

			sum-=bridge.poll();
			if(sum+truck <= L) { //새로운 트럭이 다리를 건널 수 있을 때
				bridge.add(truck);
				sum+=truck;
				if(--N == 0) break; //더이상 새로운 트럭이 없으면 중단
				
				truck = Integer.parseInt(st.nextToken());
				
			}else { //새로운 트럭이 다리를 건널 수 없을 때 -> 0을 인자로 넣어주고 기다리게 함
				bridge.add(0);
			}
			//System.out.println(bridge);
			//System.out.println(time);
		}
		
		//마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이 
		time += bridge.size(); //다리에 남아있는 트럭들 건너는 시간 합함
		System.out.println(time);	
	}
}
