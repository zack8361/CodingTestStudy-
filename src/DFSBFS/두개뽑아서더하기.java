package DFSBFS;


import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    private static ArrayList<Integer> list;
    private static boolean[] visited;
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean[] visited = new boolean[array.length];
        combination(array, visited, 0, array.length, 3);
    }

    private static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    sum+=arr[i];
                }
            }
            System.out.println(sum);
        }
        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}
