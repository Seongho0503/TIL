
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    private void solution() throws Exception {
        List<Word> list = new ArrayList<>();
        Map<String, Word> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 개수
        int m = Integer.parseInt(st.nextToken()); // 단어 길이 기준
        
        //while (n-->0) {
        for(int i = 0; i < n; i++) {
        	String cur = br.readLine();
            if (cur.length() < m) continue;

            if (map.containsKey(cur)) {
                map.get(cur).count();
                continue;
            }

            Word word = new Word(cur);
            list.add(word);
            map.put(cur, word);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Word word : list) {
            sb.append(word.name).append('\n');
        }
        System.out.print(sb);
    }
}

class Word implements Comparable<Word> {
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

 
/*
등장 횟수에 따른 정렬
*/