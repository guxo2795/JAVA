package 백준.단계별.단계15_약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int d = gcd(a,b);

            sb.append(a*b/d).append('\n');
        }
        System.out.println(sb);
    }

    // 유클리드 호제법 = 최대공약수(GCD, Greatest Common Divior)를 효율적으로 구하는 알고리즘
    // 두 정수 a,b (a > b)
    // a를 b로 나눈 나머지를 r
    // a와 b의 최대공약수는 b와 r의 최대공약수와 같음 (gcd(a,b) = gcd(b,a))
    // r이 0이 될 때까지 반복

    public static int gcd(int a, int b) {
        while(b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
