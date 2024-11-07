package 백준.단계별.단계9_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수찾기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 10001;

        for(int i = M; i <= N; i++) {
            boolean isPrime = true;

            // 1은 소수가 아님
            if(i == 1) {
                continue;
            }

            // 2는 소수임
            if(i == 2) {
                sum += i;
                min = i;
                continue;
            }

            // 짝수는 소수가 아님
            if(i % 2 == 0) {
                continue;
            }

            // 위에서 짝수는 걸래냈으므로 홀수만 판독하면됨
            // 제곱근 이용
            // 만약 i가 36이라고하면 제곱근은 6
            // 36 = 1 * 36
            // 36 = 2 * 18
            // ....
            // 36 = 6 * 6
            // 약수를 구할때는 제곱근까지만 나눠보면 됨
            // 제곱근보다 크거나 같은 수와 작거나 같은 수가 짝을 이룸
            for(int j = 3; j <= Math.sqrt(i); j += 2) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }

        if(sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }
}
