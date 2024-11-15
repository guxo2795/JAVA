package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3_카운팅정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 카운팅 정렬, 수가 중복되지 않을 때는 boolean, 시간복잡도 n
        int[] arr = new int[10000];

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())-1]++;
        }

        // 정렬과정 따로 필요 x

        for(int i = 0; i < arr.length; i++) {
            while(arr[i] > 0) {
                sb.append(i+1).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
