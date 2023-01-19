import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 받기
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		double total= 0, num=0;
		// max 구하기
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			max = max < nums[i] ? nums[i] : max; 
		}
		// 재 계산
		for (int i = 0; i < nums.length; i++) {
			// 연산방법 : /M*100  => 100먼저 곱하고 나중에 한번에 max 값으로 나누기 (max로 개별적으로 나누면 소수점 날라가서 틀림)
			//System.out.println("1차 : " + (nums[i]/max)); 나누기 먼저 하지 말고 곱하기 먼저 해야함
			//System.out.println("2차 : " + nums[i]/(max*100)); // 개별 값 마다 max값을 나누면 소수점 날라감, total 합치고 나누어야함
			num = (nums[i]*100);
			total += num;
			if(i==nums.length-1) total/=max;
		}
		System.out.println(total/N);
	}
}
