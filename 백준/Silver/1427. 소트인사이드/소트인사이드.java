import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		String str = String.join("", arr);
		System.out.print(str);
 		
	}
}
