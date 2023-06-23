import java.io.*;
import java.util.*;

public class Main {
	static double [] scores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
	
		double scoreSum = 0;
		double count = 0;
		StringTokenizer st;
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String sub = st.nextToken();
			String score = st.nextToken();
			String grade = st.nextToken();
			
			if(grade == "P") continue;
			else if(map.containsKey(grade)) {
				scoreSum += (Double.parseDouble(score) * map.get(grade));
				count += Double.parseDouble(score);
			}	
		}
		System.out.println(scoreSum / count);
	
	}
}

// 20줄 
// 과목명 학점 등급
// 1.0,2.0,3.0,4.0