package DynamicProgramming;

import java.util.Arrays;

public class ex02 {
    private static long[] dp = new long[101];
    public static void main(String[] args) {
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 2; i < 100; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(Arrays.toString(dp));
    }
}
