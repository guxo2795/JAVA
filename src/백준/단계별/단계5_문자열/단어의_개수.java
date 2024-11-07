package 백준.단계별.단계5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.print(st.countTokens());

//        int count = 0;
//        while(st.hasMoreTokens()) {
//            st.nextToken();
//            count++;
//        }
//
//        System.out.println(count);
    }
}
