package DFSBFS2;

public class 타겟넘버 {
    private static int cnt;
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(numbers,target));
    }

    private static int solution(int[] numbers, int target) {

        dfs(numbers,target,0,0);
        return cnt;
    }

    private static void dfs(int[] numbers, int target, int depth, int sum) {

        if(depth == numbers.length){
            if(sum == target){
                cnt++;
            }
            return;
        }

        dfs(numbers,target,depth+1,sum + numbers[depth]);
        dfs(numbers,target,depth+1,sum - numbers[depth]);
    }
}
