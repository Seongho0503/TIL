//package BOJ_1092_골5_배;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> machine = new ArrayList<>();
		for(int i = 0; i < N; i++)
			machine.add(Integer.parseInt(st.nextToken()));
		
		int M = Integer.parseInt(br.readLine());	
		ArrayList<Integer> box = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++)
			box.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(machine, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder()); 
		
		int cnt = 0;
		// 박스 가장 무거운 것 못 옮기면 불가능
		if(box.get(0) > machine.get(0)) {
			System.out.println(-1);
			return;
		}
			
		while(!box.isEmpty()) {
			int idx = 0;
			for(int i = 0; i < N;) {
				if(idx == box.size()) break;
				//if(box.isEmpty()) break;
				if(machine.get(i) >= box.get(idx)) {
					box.remove(idx); // index로 제거
					i++;
				}else {
					idx++;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
