package 백준.단계별.단계14_집합과맵;

import java.io.*;
import java.util.*;

public class 회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String state = st.nextToken();

            if(state.equals("enter")) {
                set.add(name);
            } else if(state.equals("leave")) {
                set.remove(name);
            }
        }



//        map.entrySet().stream()
//                .filter(entry -> entry.getValue().equals("enter"))
//                .map(Map.Entry::getKey)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);


        List<String> list = new ArrayList<>(set);
//        for(Map.Entry<String, String> entry : map.entrySet()) {
//            if(entry.getValue().equals("enter")) {
//                list.add(entry.getKey());
//            }
//        }
        Collections.sort(list, Collections.reverseOrder());
        for(String name : list) {
            bw.write(name +'\n');
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
