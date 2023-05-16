import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			sb.append(frontend(str) + '\n');
		}
		
		System.out.print(sb);
	}
	
	public static String frontend (String st) {
		return "" + st.charAt(0) + st.charAt(st.length()-1);
	}
}
