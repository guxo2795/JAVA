package 백준.단계별.단계12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;
        int max = 0;

        int[] num = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                for(int k = j+1; k < num.length; k++) {
                    sum = num[i] + num[j] + num[k];
                    if(M >= sum && sum > max) {
                        max = sum;
                        if (max == M) {
                            break;
                        }
                    }

                }
            }
        }

        System.out.println();

    }
}
