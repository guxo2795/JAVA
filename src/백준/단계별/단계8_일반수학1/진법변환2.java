package 백준.단계별.단계8_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int R = N % B;
            if (R >= 10) {
                sb.append((char) (R + 'A' - 10));
            } else {
                sb.append(N % B);
            }
            N /= B;
        }

        sb.reverse();

        System.out.println(sb);
    }
}
