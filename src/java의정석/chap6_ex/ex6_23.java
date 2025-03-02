package java의정석.chap6_ex;

public class ex6_23 {

    public static int max(int[] arr) {
        if(arr == null || arr.length == 0) {
            return -999999;
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[]data={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값크기가인배열 :"+max(new int[]{}));
    }
}
