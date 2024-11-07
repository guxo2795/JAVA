package 백준.단계별.단계6_심화1;

import java.io.*;

public class 별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for(int j = i; j < N; j++) {
                sb.append(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }
        for (int i = 1; i < N; i++) {
            for(int j = 1; j <= i; j++) {
                sb.append(" ");
            }
            for(int j = 1; j <= 2*N-1 - 2*i; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
