package 백준.단계별.단계14_집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
//        Map<Integer, Integer> map = new HashMap<>();
        // HashMap을 사용하면 value는 항상 1로 고정되어있음 -> 불필요한 메모리낭비
        // 대신 key값만 입력받는 HashSet을 이용
        Set<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());;
        for(int i = 0; i < N; i++) {
            // map.put(key, value) key는 중복x, value는 중복 가능
//            map.put(Integer.parseInt(st.nextToken()), 1);
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            // map.containsKey(Integer.parseInt(st.nextToken()))
            if(set.contains(Integer.parseInt(st.nextToken()))) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
