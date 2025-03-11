package 백준.단계별.단계16_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int last = -1;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            if(str.contains("push")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                q.offer(num);

            } else if(str.equals("pop")) {
                sb.append(q.isEmpty() ? "-1" : q.poll()).append('\n');
            } else if(str.equals("size")) {
                sb.append(q.size()).append('\n');
            } else if(str.equals("empty")) {
                sb.append(q.isEmpty() ? "1" : "0").append('\n');
            } else if(str.equals("front")) {
                sb.append(q.isEmpty() ? "-1" : q.peek()).append('\n');
            } else if(str.equals("back")) {
                sb.append(q.isEmpty() ? "-1" : last).append('\n');
            }
        }

        System.out.println(sb);
    }
}
