package 백준.단계별.단계14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map =  new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
            // Map.getOrDefault(key, defaultValue)
            // key가 존재하면 그 값을 반환하고, 존재하지않으면 defaultValue를 반환함.
            // +1을 해서 카드 개수 세기
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
        }

        System.out.println(sb);

        br.close();
    }
}
