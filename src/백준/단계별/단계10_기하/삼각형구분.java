package 백준.단계별.단계10_기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼각형구분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r1 = Integer.parseInt(br.readLine());
        int r2 = Integer.parseInt(br.readLine());
        int r3 = Integer.parseInt(br.readLine());

        if (r1 + r2 + r3 == 180) {
            if (r1 == r2 && r2 == r3) {
                System.out.println("Equilateral");
            } else if (r1 == r2 || r1 == r3 || r2 == r3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
