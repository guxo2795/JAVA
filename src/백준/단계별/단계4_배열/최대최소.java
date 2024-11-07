package 백준.단계별.단계4_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대최소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        for(int i=0; i<N; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x > max) {
                max = x;
            }
            if(x < min) {
                min = x;
            }
        }
        System.out.println(min + " " + max);
    }
}
