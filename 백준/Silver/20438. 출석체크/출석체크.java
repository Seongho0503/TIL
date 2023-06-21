import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		boolean[] v = new boolean[N + 3];
		List<Integer> SleepStudent = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		
		// 조는 학생 체크
		for (int i = 0; i < K; i++) {
			SleepStudent.add(Integer.parseInt(st.nextToken()));
		}

		// 출석 학생 체크
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < Q; i++) {
			int now = Integer.parseInt(st.nextToken());
			// 전파한 학생이 자는 학생이면 pass
			if(SleepStudent.contains(now)) continue;
			// 아직 출석 안 한 학생이면
			if (!v[now]) {
				for (int j = now; j < N + 3; j++) {
					// 학생의 배수 체크
					if (j % now == 0) {
						// 전파한 학생이 자는 학생이 아니라면 체크
						if (!SleepStudent.contains(j)) {
							v[j] = true;
						}
					}
				}
			}
		}

		int[] cumSum = new int[N + 3];
		for (int i = 3; i < cumSum.length; i++) {
			// 이전 값들  + 현재 인덱스(학생) 출석 여부
			cumSum[i] = cumSum[i - 1] + ((!v[i]) ? 1 : 0);
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			System.out.println(cumSum[e] - cumSum[s - 1]);
		}

	}

}