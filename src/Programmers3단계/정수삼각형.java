package Programmers3단계;

import java.util.Arrays;
import java.util.Date;

public class 정수삼각형 {

    private static boolean[] visited;
    private static int max;

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(triangle));
    }

    private static int solution(int[][] triangle) {
        // triangle 찍어보기.
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(Arrays.toString(triangle[i]));
        }

        visited = new boolean[triangle.length+1];
        dfs(0,0,0,triangle , 0);
        System.out.println(max);
        return 1000000;
    }

    private static void dfs(int now, int depth, int sum, int[][] triangle , int nowCol) {

        if(no)
        if(depth == triangle.length){
            System.out.println(sum);
            return;
        }

        for (int i = nowCol; i <=nowCol +1 ; i++) {
            dfs(now+1,depth+1,sum + triangle[now][i] , triangle, i);
        }

    }
}
