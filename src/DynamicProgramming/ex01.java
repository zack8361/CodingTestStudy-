package DynamicProgramming;


// 수학 머리가 필요하다.수학적 머리가 필요하다
// N - a 번째 답을 이용하여 N번째 답을 구하는 알고리즘.

/**
 * 한번 구한 값을 배열 등에 저장하고, 다음에 같은 값이 필요하면 메모해 둔 값을 사용하는 것으로 효율성을 증가시킨다. : <Memoization>
 * 일반적으로 N번째 값을 구하기 위해 기존에 구해둔 N-a번째 값을 사용하므로, 초기값은 직접 구해서 세팅하는 경우가 많다.
 * 주로 For 과 DP값을 저장하는 배열로 구현하며, 재귀함수로 구현하기도 한다.
 * 경우의 수 구하는 문제가 DP 문제인 경우가 상당히 많다.
 * 일종의 점화식을 이용해서, 초기값 1번째 혹은 2번째 값은 직접 세팅하고, 구한다.
 * 초기값 세팅과 점화식을 작성하는 것이 포인트이다.
 * ex ) fibonacci
 */
public class ex01 {
    private static long[] dp = new long[101];
    private static long fibo(int n){
        if(dp[n] > 0){
            return dp[n];
        }
        if(n<=2){
            return 1;
        }
        return dp[n] = fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(100));
    }
}
