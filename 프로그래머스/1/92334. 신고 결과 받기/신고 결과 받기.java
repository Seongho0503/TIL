import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 자료구조 세팅
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> id_map = new HashMap<>();
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], new HashSet<>());
            id_map.put(id_list[i], i);
        }
        
        // 카운트 세기
        
        for(int i = 0; i < report.length; i++){
            String[] pair = report[i].split(" ");
            String from = pair[0];
            String to = pair[1];
            
            map.get(to).add(from);    
        }
        
        // 중복에서 꺼내기
        for(String id : id_list){
            HashSet<String> set = map.get(id);
            if(set.size() >= k){
                for(String name : set ){
                answer[id_map.get(name)]++;
                }
            }
            
        }
        
        return answer;
    }
}