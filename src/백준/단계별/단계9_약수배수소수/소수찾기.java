package 백준.단계별.단계9_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cnt = N;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 1은 소수가 아님
            if(num == 1) {
                cnt--;
                continue;
            }

            // 2는 소수임
            if(num == 2) {
                continue;
            }

            // 짝수는 소수가 아님
            if(num % 2 == 0) {
                cnt--;
                continue;
            }

            // 위에서 짝수는 걸래냈으므로 홀수만 판독하면됨
            for(int j = 3; j <= Math.sqrt(num); j += 2) {
                if(num % j == 0) {
                    cnt--;
                    break;
                }
            }
        }

        System.out.println(cnt);

    }
}
