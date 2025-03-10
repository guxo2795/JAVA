package 백준.단계별.단계16_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>(); // 대기 통로
        StringTokenizer st = new StringTokenizer(br.readLine());
        int current = 1; // 간식 받을 순서
        String ans = "Nice";

        for(int i = 0; i < N; i++) {
            int student = Integer.parseInt(st.nextToken());

            // 스택에서 간식 받을 순서가 된 학생을 꺼냄
            while(!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
                current++; // 다음 간식을 받을 순서
            }

            // 간식 받을 순서와 현재 학생의 번호가 같을 경우
            if(student == current) {
                current++;
            } else {
                // 그렇지 않을 경우, 대기통로로 이동
                stack.push(student);
            }
        }

        while(!stack.isEmpty()) {
            if(stack.pop() == current) {
                current++;
            } else {
                ans = "Sad";
                break;
            }
        }
        System.out.println(ans);
    }
}
