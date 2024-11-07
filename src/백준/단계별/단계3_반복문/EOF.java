package 백준.단계별.단계3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// End of File
// 더이상 읽을 수 있는 데이터가 없을 때 종료하라.
public class EOF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        while((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A+B).append('\n');
        }
        br.close();

        System.out.println(sb);

//        Scanner in = new Scanner(System.in);
//
//        while(in.hasNextInt()) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a+b);
//        }
//        in.close();
    }
}
