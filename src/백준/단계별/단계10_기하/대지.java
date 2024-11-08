package 백준.단계별.단계10_기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int x_min = 10001;
        int x_max = -10001;
        int y_min = 10001;
        int y_max = -10001;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            x_min = Math.min(x_min, x);
            x_max = Math.max(x_max, x);
            y_min = Math.min(y_min, y);
            y_max = Math.max(y_max, y);
        }

        System.out.println((x_max - x_min) * (y_max - y_min));
    }
}
