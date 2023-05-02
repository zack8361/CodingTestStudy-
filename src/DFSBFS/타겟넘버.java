package DFSBFS;

public class 타겟넘버 {

    static int answer = 0;
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(numbers,target));


    }

    private static int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return answer;
    }

    private static void dfs(int[] numbers, int target, int depth, int sum) {
        if(depth == numbers.length){
            if(sum==target){
                System.out.println(sum);
                answer++;
            }
        }
        else {
            dfs(numbers, target, depth + 1,sum + numbers[depth]);
            dfs(numbers, target, depth + 1,sum - numbers[depth]);
        }

    }

}
