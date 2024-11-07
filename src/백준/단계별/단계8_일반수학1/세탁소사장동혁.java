package 백준.단계별.단계8_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소사장동혁 {

    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;
    private static final int PENNY = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int[] coins = {QUARTER, DIME, NICKEL, PENNY};

        for (int i = 0; i < T; i++) {
            int Money = Integer.parseInt(br.readLine());

            for (int coin : coins) {
                sb.append(Money / coin).append(" ");
                Money %= coin;
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
