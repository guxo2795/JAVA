package 백준.단계별.단계1_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B%10));
        sb.append('\n');

        sb.append(A * ((B%100)/10));
        sb.append('\n');

        sb.append(A * (B/100));
        sb.append('\n');

        sb.append(A * B);

        System.out.println(sb);
    }
}
