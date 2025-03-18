package 면접_손코딩;

// 최소공배수 = a*b/최대공약수
// 최대공약수 = 유클리드호제법
// a % b = r
// r이 0이 될때 b가 최대공약수
// 48 % 18 = 12
// 18 % 12 = 6
// 12 % 6 = 0 => 6이 최대공약수
// 48 * 18 / 6 = 144가 최소공배수

public class 최소공배수 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println((a*b)/gcd(a,b));
    }
    
    // 유클리드호제법
    public static int gcd(int a, int b) {
        while(b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
}
