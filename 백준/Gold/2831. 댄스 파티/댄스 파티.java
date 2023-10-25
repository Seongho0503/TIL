import java.io.*;
import java.util.*;

public class Main {
    static int res = 0;

    public static void solve(int[] smaller, int[] bigger) {
        int smallIdx = 0;
        int biggerIdx = bigger.length - 1;

        while (smallIdx < smaller.length && biggerIdx >= 0) {
            if (smaller[smallIdx] + bigger[biggerIdx] < 0) {
                res++;
                smallIdx++;
                biggerIdx--;
            } else {
                biggerIdx--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] men = new int[N];
        int[] women = new int[N];

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            men[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            women[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(men);
        Arrays.sort(women);

        int manPlusIndex = Arrays.binarySearch(men, 0);
        int womanPlusIndex = Arrays.binarySearch(women, 0);

        if (manPlusIndex < 0) {
            manPlusIndex = -manPlusIndex - 1;
        }

        if (womanPlusIndex < 0) {
            womanPlusIndex = -womanPlusIndex - 1;
        }

        solve(Arrays.copyOfRange(men, 0, manPlusIndex), Arrays.copyOfRange(women, womanPlusIndex, women.length));
        solve(Arrays.copyOfRange(women, 0, womanPlusIndex), Arrays.copyOfRange(men, manPlusIndex, men.length));

        System.out.println(res);
    }
}