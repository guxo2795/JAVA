package programmers;

import java.util.Arrays;

public class 문자열내마음대정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] answer = new String[strings.length];

        // 문자열 정렬
        // Arrays.sort()

        // 1. strings[i].charAt(n)을 뽑아서 맨 앞에 위치시킨다.
        // 2. strings[i].charAt(n) + strings[i];
        // 3. ["usun", "ebed", "acar"] 정렬시키기
        // 4. ["acar", "ebed", "usun"]


        // 5. ["babce", "babcd", "dcdx"] 정렬시키기
        // 6. ["babcd", "babce", "dcdx"]

        // 7. 맨 앞 문자 제거, substring()
        // 8. 배열 출력

        for(int i = 0; i < strings.length; i++) {
             answer[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(answer);

        for(int i = 0; i <answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }


        for(String str : answer) {
            System.out.println(str);
        }
    }
}
