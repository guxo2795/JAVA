package 백준.단계별.단계12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int minCount = 64;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                // 각 패턴 별로 칠해야할 개수를 따로 구해서 비교
                int count1 = 0; // BWBW 짝수칸에 B
                int count2 = 0; // WBWB 짝수칸에 W

                for (int p = i; p < i + 8; p++) {
                    for (int q = j; q < j + 8; q++) {
                        if ((p + q) % 2 == 0) { // 짝수칸에 어떤 패턴이 있어야 하는가
                            if (arr[p][q] != 'B') count1++; // 짝수칸에 B가 있어야 하는데 없으니까 +1
                            if (arr[p][q] != 'W') count2++; // 짝수칸에 W가 있어야 하는데 없으니까 +1
                        } else { // 홀수칸에 어떤 패턴이 있어야 하는가
                            if (arr[p][q] != 'W') count1++; // 홀수칸에 W가 있어야 하는데 없으니까 +1
                            if (arr[p][q] != 'B') count2++; // 홀수칸에 B가 있어야 하는데 없으니까 +1
                        }
                    }
                }
                minCount = Math.min(minCount, Math.min(count1, count2));
            }
        }

        System.out.println(minCount);

    }
}
