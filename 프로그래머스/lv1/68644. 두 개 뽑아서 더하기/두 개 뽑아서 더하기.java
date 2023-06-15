import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        return list;
    }
}

/*
더하기 + : 교환법칙(순열 X)
서로 다른 인덱스 : 중복 X

*/