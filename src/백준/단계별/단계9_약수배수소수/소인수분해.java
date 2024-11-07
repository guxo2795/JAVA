package 백준.단계별.단계9_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // 1일 경우 아무것도 출력x
        // 2, 3일 경우 여기서 출력됨
        // 위의 로직에서 97 출력후 남아있는 103은 여기서 출력됨
        if (N > 1) {
            System.out.println(N);
        }
    }
}
