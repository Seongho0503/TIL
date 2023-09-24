//package BOJ_21735_실3_눈덩이굴리기;

import java.io.*;
import java.util.*;

public class Main {
    static int[] snow = new int[101]; // 눈덩이 크기
    static int N, M;
    static int answer = 0; // 가장 큰 눈덩이 크기

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            snow[i] = scanner.nextInt();
        }

        func(0, 1, 0);
        System.out.println(answer);
    }

    static void func(int time, int size, int depth) {
        if (time == M || depth >= N) { // 대회 시간이 경과된 경우 또는 눈덩이가 앞마당의 끝에 도달한 경우
            answer = Math.max(size, answer);
            return;
        }

        // 눈덩이를 굴리는 경우와 던지는 경우
        for (int i = 1; i <= 2; i++) {
            if (i == 1) {
                func(time + 1, size + snow[depth + i], depth + i); // 눈덩이를 굴리는 경우
            } else {
                func(time + 1, (size / 2) + snow[depth + i], depth + i); // 눈덩이를 던지는 경우
            }
        }
    }
}