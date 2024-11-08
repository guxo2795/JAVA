package 백준.단계별.단계11_시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 자료형 범위 확인 잘 할 것..
        // Math.pow의 반환 값은 double이니까 정수형으로 변환해야함
        System.out.println((long)Math.pow(Long.parseLong(br.readLine()),2));
        System.out.println(2);
    }
}
