package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기2_CollectionsSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Arrays.sort = dual-pivot Quicksort , nlogn ~ n^2
        // Collections.sort = Timesort(합병 + 삽입), n ~ nlogn

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int val : list) {
            sb.append(val).append('\n');
        }

        System.out.println(sb);

    }
}
