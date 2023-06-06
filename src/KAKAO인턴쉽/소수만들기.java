package KAKAO인턴쉽;

import java.util.Arrays;

public class 소수만들기 {
    private static int answer;
    private static boolean[] visited;
    private static int cnt;
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {

        dfs(nums,0,0,0);

        return cnt;
    }

    private static void dfs(int[] nums, int depth, int sum, int start) {

        if(depth == 3){
            if(isPrime(sum)){
                cnt++;
            }

            return;
        }

        for (int i = start; i < nums.length; i++) {
            dfs(nums,depth+1,sum +nums[i],i+1);
        }
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
