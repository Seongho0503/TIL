import java.util.*;

class Solution {
    static String[] alp = {"R", "T", "C", "F", "J", "M", "A", "N"};
    static int[] score = {3, 2, 1, 0, 1, 2, 3};
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : alp){
            map.put(s, 0);
        }
        
         for(int i = 0; i < survey.length; i++){
             
             String[] ap = survey[i].split(""); 
             String key = "";
             
             if(choices[i] > 4){
                key = ap[1];
             }else if(choices[i] == 4){
                key = ap[0].compareTo(ap[1]) > 0 ? ap[1] : ap[0];
             }else {
                key = ap[0];
             }
            // System.out.println(key + " " + score[i]);
             map.put(key, map.get(key) + score[choices[i]-1]);
        }
        
        answer = doResult(map);
        return answer;
    }
    
    static String doResult(HashMap<String, Integer> map){
        char[] arr = new char[4];
        
        arr[0] = map.get("R") >= map.get("T") ? 'R' : 'T';
        arr[1] = map.get("C") >= map.get("F") ? 'C' : 'F';
        arr[2] = map.get("J") >= map.get("M") ? 'J' : 'M';
        arr[3] = map.get("A") >= map.get("N") ? 'A' : 'N';
        
        return String.valueOf(arr);
    }
}
