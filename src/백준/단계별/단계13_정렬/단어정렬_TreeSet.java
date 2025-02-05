package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class 단어정렬_TreeSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 자동으로 정렬해주는 TreeSet이용.
        Set<String> set = new TreeSet<>((a, b) ->
                a.length() == b.length() ? a.compareTo(b) : Integer.compare(a.length(), b.length())
        );

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());  // 중복 제거, 자동 정렬
        }

        for(String str : set) {
            System.out.println(str);
        }

    }
}
