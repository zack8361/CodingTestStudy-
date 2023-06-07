package newProgrammers2단계;

import java.util.Arrays;

public class 피보나치수 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        dfs(n);

        return 0;
    }

    private static void dfs(int n) {
        System.out.println(n);
        if(n == 0){
            return;
        }
        dfs(n-1);
    }
}
