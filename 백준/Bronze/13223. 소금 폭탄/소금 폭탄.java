import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int[] st = new int[3];
	        int[] et = new int[3];

	        String[] stInput = reader.readLine().split(":");
	        String[] etInput = reader.readLine().split(":");

	        for (int i = 0; i < 3; i++) {
	            st[i] = Integer.parseInt(stInput[i]);
	            et[i] = Integer.parseInt(etInput[i]);
	        }

	        int sTotal = st[0] * 3600 + st[1] * 60 + st[2];
	        int eTotal = et[0] * 3600 + et[1] * 60 + et[2];

	        if (sTotal >= eTotal) {
	            eTotal += 24 * 3600;
	        }

	        int ans = eTotal - sTotal;
	        System.out.printf("%02d:%02d:%02d", ans / 3600, (ans % 3600) / 60, ans % 60);

	}
}
