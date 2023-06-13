import java.util.*;

class Solution {
    static int[] person1 = {1, 2, 3, 4, 5}; //5
    static int[] person2= {2, 1, 2, 3, 2, 4, 2, 5}; // 8
    static int[] person3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
    
    public LinkedList<Integer> solution(int[] answers) {
        int[] answer = {0, 0, 0};
        LinkedList <Integer> count = new LinkedList<>();
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == person1[i % 5]) answer[0]++;
            if(answers[i] == person2[i % 8]) answer[1]++;
            if(answers[i] == person3[i % 10]) answer[2]++;
        }
        
        int max = 0;
        for(int i = 0; i < answer.length ; i++){
              max = max < answer[i] ? answer[i] : max;
        }
        
        for(int i = 0; i < answer.length; i++){
            if(max == answer[i]) count.add(i+1);
        }
        
        return count;
    }
}

//  1, 2, 3, 4, 5
//  2, 1, 2, 3, 2, 4, 2, 5
//  3  3  1  1  2  2  4  4  5  5