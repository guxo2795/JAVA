package 백준.단계별.단계16_스택;

import java.io.*;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            Stack<Character> stack  = new Stack<>();
            String ans = "yes";

            if(str.equals(".")) {
                break;
            }

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if(ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if(ch == ')') {
                    if(!stack.isEmpty() && stack.pop().equals('(')) {
                        continue;
                    } else {
                        ans = "no";
                        break;
                    }
                } else if(ch ==']') {
                    if (!stack.isEmpty() && stack.pop().equals('[')) {
                        continue;
                    } else {
                        ans = "no";
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) {
                ans = "no";
            }

            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
