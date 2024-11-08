package 백준.단계별.단계10_기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삼각형과세변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int l1 = Integer.parseInt(st.nextToken());
            int l2 = Integer.parseInt(st.nextToken());
            int l3 = Integer.parseInt(st.nextToken());

            if (l1 == 0 && l2 == 0 && l3 == 0) {
                break;
            }

            int max = Math.max(l1, Math.max(l2, l3));
            int side = l1 + l2 + l3 - max;

            if(max < side) {
                if(l1 == l2 && l2 == l3) {
                    System.out.println("Equilateral");
                } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
