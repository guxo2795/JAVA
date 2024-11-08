package 백준.단계별.단계11_시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

//        int cnt = 0;
//        for(int i = 1; i < N; i++) { // N - 1 번
//            for (int j = i+1; j <= N; j++) { // N - i 번
//                cnt++;
//            }
//        }
        // 등차수열 합 공식 : n * (n+1) / 2
        // 1~n-1번
        // => (n - 1) * n / 2

        // N의 범위 1~500000
        // 계산 결과가 int형의 범위를 벗어남
        System.out.println((long)(N - 1) * N / 2);
        System.out.println(2);
    }
}
