package SSAFYD2;

//dfs 와 재귀함수를 활용할수 있는 문제.
public class 타겟넘버 {
    public static void main(String[] args) {
        int[] numbers = {1,1,1};
        int target = 3;
        System.out.println(solution(numbers,target));
    }

    private static int solution(int[] numbers, int target) {
        int answer =  0;
        int depth = 0;
        int sum = 0;
        return dfs(answer,target,numbers,depth,sum);

    }

    private static int dfs(int answer,int target, int[] numbers,int depth, int sum) {
        if(depth == numbers.length){
            if(sum == target){

                answer++;
            }
        }
        else {
            dfs(answer,target,numbers,depth+1,sum + numbers[depth]);
            dfs(answer,target,numbers,depth+1,sum - numbers[depth]);
        }
        return answer;
    }
}
