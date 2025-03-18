package 면접_손코딩;


// 첫 두 수가 0과 1
// 그 다음 수는 이전 두 숫자의 합
// 0 1 1 2 3 5 8 13 21 ....
public class 피보나치 {
    
    // 재귀
    public static int fibo(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibo(n-1) + fibo(n-2);
    }

}
