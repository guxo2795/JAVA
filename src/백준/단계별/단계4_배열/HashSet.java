package 백준.단계별.단계4_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for(int i=0; i<10; i++) {
            set.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(set.size());

    }
}
