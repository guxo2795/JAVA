package 백준.단계별.단계7_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] M = new char[5][15];
        int maxLength = -1;

        for(int i = 0; i < 5; i++) {
            char[] str = br.readLine().toCharArray();

            if(str.length > maxLength) {
                maxLength = str.length;
            }

            for(int j = 0; j < str.length; j++) {
                M[i][j] = str[j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < maxLength; j++) {
            for(int i = 0; i < 5; i++) {
                if(M[i][j] != '\u0000') { // char배열 초기값 유효성 확인
                    sb.append(M[i][j]);
                }
            }
        }

//        for(int j = 0; j < maxLength; j++) {
//            for(int i = 0; i < 5; i++) {
//                if(M[i][j] == '\0') {
//                    continue;
//                }
//                sb.append(M[i][j]);
//            }
//        }

        System.out.print(sb);

    }
}
