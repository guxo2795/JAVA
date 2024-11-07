package 백준.단계별.단계8_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int room = 1;
        int l = 1;
        while (N > room) {
            room += (6 * l++);
        }
        System.out.println(l);
    }
}
