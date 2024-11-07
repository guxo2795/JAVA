package 백준.단계별.단계7_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[][] W = new boolean[100][100];

        int area = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    if(!W[j][k]) {
                        W[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);

    }
}
