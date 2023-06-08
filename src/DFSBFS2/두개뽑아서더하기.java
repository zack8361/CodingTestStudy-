package DFSBFS2;

public class 두개뽑아서더하기 {
    private static int cnt;
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {

        dfs(numbers,0,0, 0);
        return cnt;
    }

    private static void dfs(int[] numbers, int depth, int sum, int now) {

        if(depth == 3){
            System.out.println("sum = " + sum);
            return;
        }

        for (int i = now; i < numbers.length; i++) {
            dfs(numbers,depth + 1,sum + numbers[i] , i+1);
        }
    }
}
