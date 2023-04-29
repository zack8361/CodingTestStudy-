package DFSBFS;

import java.util.Arrays;

public class 혼자풀어보기 {
    private static boolean[]visited;
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int[] arr2 = new int[arr.length];
        visited = new boolean[arr2.length];

        dfs(arr,arr2,0);
        return 0;
    }

    private static void dfs(int[] arr, int[] arr2, int depth) {
        if(depth == arr.length){
            System.out.println(Arrays.toString(arr2));
        }
    }
}
