package 백준.단계별.단계16_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String input = br.readLine();
            String anw = "YES";

            for(int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                if(ch == '(') {
                    stack.push("(");
                } else if(ch == ')') {
                    if(!stack.isEmpty() && stack.pop().equals("(")){
                        continue;
                    } else {
                        anw = "NO";
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) { // 스택이 남아있으면 '('가 더 많은 것
                anw = "NO";
            }

            System.out.println(anw);
        }
    }
}
