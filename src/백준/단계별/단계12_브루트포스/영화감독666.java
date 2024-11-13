package 백준.단계별.단계12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독666 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int i = 666;

        while(cnt < N) {
            int tmp = i;
            int seq = 0;

            while (tmp > 0) {
                int r = tmp % 10;
                tmp /= 10;

                if(r == 6) {
                    seq++;
                } else {
                    seq = 0;
                }

                if(seq == 3) {
                    cnt++;
                    break;
                }
            }
            if(cnt < N) {
                i++;
            }
        }
        System.out.println(i);

//        while(true) {
//            if (Integer.toString(i).contains("666")) {
//                cnt++;
//            }
//            if (cnt == N) {
//                System.out.println(i);
//                break;
//            }
//            i++;
//        }
    }
}
