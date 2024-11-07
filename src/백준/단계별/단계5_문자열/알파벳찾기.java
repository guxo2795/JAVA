package 백준.단계별.단계5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] anw = new int[26];

        for (int i = 0; i < 26; i++) {
            anw[i] = -1;
        }

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // ch에서 97 또는 'a'를 빼면 0이 된다.
            if (anw[ch - 97] == -1) {
                anw[ch - 97] = i;
            }
        }

        for (int val : anw) {
            System.out.print(val + " ");
        }


    }
}
