package 백준.단계별.단계5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((int)br.readLine().charAt(0));
        // br.readLine() 문자열string을 charAt으로 char로 변환
        // int타입으로 변환하여 아스키코드 값으로 변환

        System.out.println(System.in.read());
        // System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
        // 반드시 주의해야 할 점은 예외처리를 해주어야한다.
    }
}
