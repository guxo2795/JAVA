package 백준.단계별.단계14_집합과맵;

import java.io.*;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
        int M = Integer.parseInt(st.nextToken()); // 보도 못한 사람

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        List<String> list = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(map.containsKey(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);

        bw.write(list.size()+"\n");

        for(String str : list) {
            bw.write(str+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
