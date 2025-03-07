package 백준.단계별.단계16_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> st = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                sum -= st.pop();
            } else {
                st.push(n);
                sum += n;
            }
        }

        System.out.println(sum);
    }
}
