package 백준.단계별.단계11_시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점근적표기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // a1, a0는 음수일 수 있음
        // c , n0는 양수

        // a0가 음수일 때 문제가 생김
        // 5n-2 <= 3n
        // n은 1일때 3 <= 3 (만족)
        // n은 2일때 8 <= 6 (만족x)
        // a1 <= c조건 추가
        if((a1 * n0 + a0) <= c * n0 && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
