package 백준.단계별.단계14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 서로다른_부분문자열의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                set.add(str.substring(i,j));
            }
        }

        System.out.println(set.size());

    }
}
