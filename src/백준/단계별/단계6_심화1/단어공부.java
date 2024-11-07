package 백준.단계별.단계6_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부 {
    public static void main(String[] args) throws IOException {

        int[] alpha = new int[26];

        int c = System.in.read();
        // 하나의 byte 값을 읽고 해당 문자의 아스키값을 반환
        // 출력할때는 char로 변환 해야함

        while (c > 64) { // 알파벳이 아닌게 들어오면 종료 => 공백
            if (c < 97) { // 대문자
                alpha[c-65]++;
            } else { // 소문자
                alpha[c-97]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2; // ?는 63이라서

        for (int i = 0; i < 26; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
                ch = i;
            } else if (alpha[i] == max) {
                ch = -2;
            }
        }
        System.out.println((char)(ch+65));

    }
}
