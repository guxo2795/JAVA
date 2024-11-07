package 백준.단계별.단계3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringbuilder사용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken())
                            + Integer.parseInt(st.nextToken()))
                    .append('\n');
        }
        br.close();

        System.out.println(sb);
    }
}
