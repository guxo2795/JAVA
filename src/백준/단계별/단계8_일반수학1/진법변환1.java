package 백준.단계별.단계8_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 진법변환1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;

        int num = 1;

        for(int i = N.length()-1; i >=0 ; i--) {
            char ch = N.charAt(i);

            if(ch >= 'A') {
                result += (ch-'A' + 10)*num;
            } else {
                result += (ch-'0')*num;
            }

            num *= B;

        }
        System.out.println(result);

//        ArrayList<Character> result = new ArrayList<>();
//
//        while (N > 0) {
//            int R = N % B;
//            if (R >= 10) {
//                result.add((char) ('A' + R - 10));
//            } else {
//                result.add((char) ('0' + R));
//            }
//            N /= B;
//        }
//
//        for(int i = result.size()-1; i >= 0; i--) {
//            System.out.print(result.get(i));
//        }

    }
}
