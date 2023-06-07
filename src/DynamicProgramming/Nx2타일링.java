package DynamicProgramming;

import java.util.Arrays;

public class Nx2타일링 {
    public static void main(String[] args) {
        int N = 4;
        System.out.println(solution(N));
    }

    private static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1234567;
        }

        return dp[n];
    }
}
