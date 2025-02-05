package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 좌표정렬하기1_Comparator_람다식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]) {
//                    return o1[1] - o2[1]; // 값이 음수일 경우 o1이 o2보다 앞, 같을 경우 순서 유지
//                                        // 양수일 경우 o2가 앞
//                }
//                else {
//                    return o1[0] - o2[0]; // 오름차순
//                }
//            }
//        });
//
//        // Arrays.sort + 람다식
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[0] == o2[0]) {
//                return o1[1] - o2[1];
//            } else {
//                return o1[0] - o2[0];
//            }
//        });

//        Arrays.sort(arr, (o1, o2) ->
//                o1[0] == o2[0] ? Integer.compare(o1[1], o2[1]) : Integer.compare(o1[0], o2[0])
//        );
        // 가독성
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0])
                .thenComparingInt(o -> o[1]));

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }
        System.out.println(sb);


        // 버블정렬을 이용해보려고 했는데 이렇게 하면 시간초과임!
//        for(int i = 0; i < N-1; i++) {
//            for (int j = i + 1; j < N; j++) {
//                if (arr[i][0] > arr[j][0] || (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1])) { // x좌표 비교해서 오름차순
//                    int tmp = arr[j][0];
//                    arr[j][0] = arr[i][0];
//                    arr[i][0] = tmp;
//                    int tmp2 = arr[j][1];
//                    arr[j][1] = arr[i][1];
//                    arr[i][1] = tmp2;
//                }
//            }
//        }
//        for(int[] point : arr) {
//            System.out.println(point[0] + " " + point[1]);
//        }
    }
}
