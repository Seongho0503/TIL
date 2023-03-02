// prices가 시간이 지남에 따라(= 인덱스가 증가할 때) 값이 한 번 이라도 종료되면 그 전까지의 개수를 배열로 반환하면 된다.
// 중요한 것은 한 번이라도 값이 증가할 때만 체크하자!
class Solution {
    public int[] solution(int[] prices) {
        // count 배열도 길이가 prices와 같다
        int[] count = new int[prices.length];
        // i는 현재 주식 가겨이고 j는 미래의 가격이나 최소 현재 시간보다 +1 커야 한다. (1초 기준)
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                count[i] += 1;
                // 미래의 가격이 현재 가격보다 작으면 종료
                if (prices[j] < prices[i]) break;
                
            }
        }

        return count;
    }
}