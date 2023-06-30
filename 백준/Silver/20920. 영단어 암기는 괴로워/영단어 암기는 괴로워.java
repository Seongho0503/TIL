import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Word> list = new ArrayList<>();
        // 단어 , 객체
        Map<String, Word> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 개수
        int m = Integer.parseInt(st.nextToken()); // 단어 길이 기준
        
        //while (n-->0) {
        for(int i = 0; i < n; i++) {
        	String cur = br.readLine();
        	// 거르기
            if (cur.length() < m) continue;
            
            // 객체 프로퍼티(cnt) 증가
            if (map.containsKey(cur)) {
                map.get(cur).count();
                continue;
            }
            
            // 키(단어)가 없으면 새로운 객체를 생성
            Word word = new Word(cur);
            list.add(word);
            // 객체를 참조
            // word의 프로퍼티가 바뀌면 list 안 객체의 프로퍼티도 바뀐다.
            map.put(cur, word);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Word word : list) {
            sb.append(word.name).append('\n');
        }
        System.out.print(sb);
    }


public static class Word implements Comparable<Word> {
    String name;
    int cnt;

    public Word(String name) {
        this.name = name;
        cnt = 1;
    }

    public void count() {
        this.cnt++;
    }

    @Override
    public int compareTo(final Word o) {
        if (this.cnt != o.cnt) {
            return o.cnt - this.cnt;
        }

        if (this.name.length() != o.name.length()) {
            return o.name.length() - this.name.length();
        }

        return this.name.compareTo(o.name);
    }
  }

} 

/*
등장 횟수에 따른 정렬

*/