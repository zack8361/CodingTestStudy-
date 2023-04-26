package Programmers2단계;

import java.util.Arrays;

class Solutions {
    static int answer = 1;
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;
        System.out.println(solution(numbers,target));
    }

    public static int solution(int[] numbers, int target) {

        dfs(0,0,numbers,target);
        return answer;
    }

    private static void dfs(int depth, int sum, int[] numbers, int target) {

        if(depth == numbers.length){
            if(sum == target) answer++;
        }
        else {
            dfs(depth+1,sum+numbers[depth],numbers,target);
            dfs(depth+1,sum-numbers[depth],numbers,target);
        }

    }
}







