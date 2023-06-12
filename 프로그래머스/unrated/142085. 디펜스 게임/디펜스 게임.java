import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int my = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            my -= enemy[i];
            pq.add(enemy[i]);

            if (my < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    my += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}


/*

<패스 카드 사용>
1. 가자 큰 wave 거나
2. 현재 죽을 때



*/