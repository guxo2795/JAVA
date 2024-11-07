package 백준.단계별.단계9_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 약수의합_완전수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int N = Integer.parseInt(br.readLine());

            if(N == -1) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            int sum = 0;

            sb.append(N).append(" = ");

            for(int i = 1; i <= N/2; i++) {
                if(N % i == 0) {
                    sb.append(i).append(" + ");
                    sum += i;
                }
            }

            // substring, delete 두 가지 가능
            // substring은 문자열을 그대로 두고 새로운 string객체를 반환 -> 메모리를 더 씀.
            // delete는 문자열을 내부적으로 수정 -> 메모리를 더 쓰진 않지만 기존 문자열 훼손.
            if(sum == N) {
                System.out.println(sb.substring(0, sb.length()-3));
//                sb.delete(sb.length()-3, sb.length());
//                System.out.println(sb);
            } else {
                System.out.println(N + " is NOT perfect.");
            }


        }

    }

}
