package 백준.단계별.단계11_시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

//        int cnt = 0;
//        for (int i = 1; i <= N - 2; i++) { // N-2
//            for (int j = i + 1; j <= N - 1; j++) { //
//                for (int k = j + 1; k <= N; k++) {
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);

        // N에서 i, j, k 의 서로 다른 3개의 수를 선택 => nC3
        // n(n-1)(n-2) / 3!

        System.out.println(N*(N-1)*(N-2)/6);
        System.out.println(3);
    }
}
