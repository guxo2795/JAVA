package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬_HashSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 중복을 제거하기 위한 Set 사용
        // 인터페이스타입으로 선언하는 것을 습관화 할 것. Set, List -> 유연성, 추상화
        Set<String> set = new HashSet<>();

        for(int i = 0; i < N ; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) ->
                a.length() == b.length() ? a.compareTo(b) : Integer.compare(a.length(), b.length())
        );
        // compartTo() : 문자열을 사전순으로 비교하는 메서드

        for(String str : list) {
            System.out.println(str);
        }

    }
}
