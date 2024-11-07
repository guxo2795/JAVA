package 백준.단계별.단계8_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        // 몇 번째 대각선에 있는 지 찾기
        int k = 1;
        while (X > (k * (k + 1)) / 2) {
            k++;
        }

        // 대각선 내에서 몇 번째에 위치해 있는 지 찾기
        int position = X - (k * (k - 1)) / 2;

        // 대각선 방향, 분수 찾기
        if(k % 2 == 0) { // 짝수 대각선(위에서 아래로)
            System.out.println(position + "/" + (k - position + 1));
        } else { // 홀수 대각선
            System.out.println((k - position + 1) + "/" + position);
        }

    }
}
