package 백준.단계별.단계12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while(N >= 0) {
            if(N % 5 == 0) {
                count += N/5;
                System.out.println(count);
                return;
            }
            // 3과 5로 딱 맞아 떨어질 경우 3을 빼다보면 N은 0이됨.
            // N이 0이될 경우 위의 if문에서 개수가 출력되고 종료.
            N-=3;
            count++;
        }
        // while문을 탈출해서 나올경우 3과 5로 딱 맞아 떨어지지 않기때문에 -1
        System.out.println(-1);

//        int min = 1667;
//
//        for(int i = 0; i <= 1000; i++) {
//            for(int j = 0; j <= 1666; j++) {
//                if((5*i) + (3*j) == N) {
//                    int cnt = i + j;
//                    min = Math.min(min, cnt);
//                }
//            }
//        }
//        if(min == 1667) {
//            System.out.println(-1);
//        } else {
//            System.out.println(min);
//        }
    }
}
