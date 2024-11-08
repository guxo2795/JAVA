package 백준.단계별.단계11_시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간5_pow의한계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n^3을 계산하는 문제
        // n의 범위가 1~500000이기때문에 제곱을 했을 때 int형의 범위를 벗어나기 때문에
        // pow()를 이용한 후 long형으로 명시적 형변환 -> 오류 발생
        // 왜 why Math.pow()는 double형으로 계산하고 리턴을 하는데,
        // 너무 큰 long 숫자는 double형으로 변환 시 오차 범위가 생김 (부동 소수점 방식)

//        System.out.println((long)Math.pow(Long.parseLong(br.readLine()), 3));

        long N = Long.parseLong(br.readLine());
        System.out.println(N * N * N);
        System.out.println(3);
    }
}
