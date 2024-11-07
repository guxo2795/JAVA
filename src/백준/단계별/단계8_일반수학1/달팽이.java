package 백준.단계별.단계8_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가고
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지고
        int V = Integer.parseInt(st.nextToken()); // 꼭대기

        int days= (V - B) / (A - B);
        if((V - B) % (A - B) != 0) {
            days++;
        }

//        int days = (V - B - 1) / (A - B) + 1;

        System.out.println(days);
    }
}
