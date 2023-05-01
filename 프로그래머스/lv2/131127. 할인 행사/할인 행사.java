import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> bag = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            map.put(want[i], 1 * number[i]);
        }

        int idx = -1;
        for(int k = 0; k < discount.length; k++){
            
            if(k < 10){
                bag.put(discount[k], bag.getOrDefault(discount[k], 0) + 1);
            }else {
                bag.put(discount[++idx], bag.get(discount[idx]) -1);
                bag.put(discount[k], bag.getOrDefault(discount[k], 0) + 1);
                bag.values().remove(0);
            }
            
            if(bag.equals(map)) answer++;
            
        }
              
        return answer;
    }
}