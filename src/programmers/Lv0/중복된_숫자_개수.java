package programmers.Lv0;

import java.util.Arrays;

public class 중복된_숫자_개수 {

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(num-> num == n)
                .count();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,1};
        System.out.println(solution(arr,1));
    }
}


