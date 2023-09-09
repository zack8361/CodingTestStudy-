package 고득점kitDFS;

public class 타겟넘버 {
    private static int cnt;
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(numbers,target));
    }

    private static int solution(int[] numbers, int target) {
        dfs(0,0,numbers,target);
        return cnt;
    }

    private static void dfs(int depth, int sum, int[] numbers, int target) {
        if(depth == numbers.length){
            if(sum == target){
                cnt++;
            }
            return;
        }
        dfs(depth+1,sum+numbers[depth], numbers,target);
        dfs(depth+1,sum-numbers[depth], numbers,target);
    }
}
