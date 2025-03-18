package 백준.단계별.단계4_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 서로다른나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++) {
            set.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(set.size());

    }
}
