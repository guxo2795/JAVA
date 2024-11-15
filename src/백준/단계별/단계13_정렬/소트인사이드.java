package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();

        Arrays.sort(chars);

        for(int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

//        String numString = br.readLine();
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i < numString.length(); i++) {
//            list.add(numString.charAt(i) - '0');
//        }
//
//        Collections.sort(list, Collections.reverseOrder());
//
//        for(int val : list) {
//            System.out.print(val);
//        }

    }
}
