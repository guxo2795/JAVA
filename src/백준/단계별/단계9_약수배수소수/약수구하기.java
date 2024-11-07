package 백준.단계별.단계9_약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

//        // 약수의 개수가 몇개 인 지 모르니까 ArrayList에 담기
//        ArrayList<Integer> divisors = new ArrayList<>();
//
//        for (int i = 1; i <= N; i++) {
//            if(N % i == 0) {
//                divisors.add(i);
//            }
//        }
//
//        if(K <= divisors.size()) {
//            System.out.println(divisors.get(K-1));
//        } else {
//            System.out.println(0);
//        }

        int count = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if(N % i == 0) {
                count++;
                if(count == K) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);

    }
}
