package 면접_손코딩;

// 동적계획법(Dynamic Programming, DP)
// 복잡한 문제를 작은 부분문제로 나누어 해결하고 그 결과를 저장하여 중복계산을 피하는 방법
public class 동적계획법 {

    // 메모이제이션
    public static int fiboMemoization(int n, int[] memo) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(memo[n] != -1) return memo[n]; // 이미 계산된 값
        memo[n] = fiboMemoization(n-1, memo) + fiboMemoization(n-2, memo); // 계산 후 저장
        return memo[n];
    }
}
