package 백준.단계별.단계14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // map을 사용하면 key값으로 value값을 불러오는 것은 간단.
        // but value값을 이용해서 key값을 가져오는 것은 시간이 오래걸림.
        // => 반대 map을 하나 더 만든다 -> O(1)시간 안에 value로 key값을 찾을 수 있음.

        Map<String, Integer> stringToNum = new HashMap<>(); // 문자열로 숫자를
        Map<Integer, String> numToString = new HashMap<>(); // 숫자로 문자열을

        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            stringToNum.put(str, i);
            numToString.put(i, str);
        }

        // chars()는 문자열을 정수(유니코드) 스트림으로 변환

        for(int i = 0; i < M; i++) {
            String input = br.readLine();
            // 입려된 문자열이 숫자(1~9)인지 영어인지 확인
            // 숫자 1은 아스키코드로 49, 숫자 9는 57
            // 대문자 A는 65, 대문자 Z는 90
            // 소문자 a는 97, 소문자 z는 122
            if(49 <= input.charAt(0) && input.charAt(0) <= 57) { // 숫자라면~
                sb.append(numToString.get(Integer.parseInt(input))).append('\n');
            } else { // 영어로 된 문자열이라면
                sb.append(stringToNum.get(input)).append('\n');
            }
        }

//        for(int i = 0; i < M; i++) {
//            String input = br.readLine();
//            if(input.chars().allMatch(Character::isDigit)) { // 입력이 숫자일 경우
//                sb.append(numToString.get(Integer.parseInt(input))).append('\n');
//            } else { // 입력이 문자열
//                sb.append(stringToNum.get(input)).append('\n');
//            }
//        }

        System.out.println(sb);


    }
}
