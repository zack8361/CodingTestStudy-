package 백준실버2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class 가장긴증가하는부분수열 {
    private static int max = 0;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        visited = new boolean[T];
        for(int i=0; i<T; i++){
            arr[i] = sc.nextInt();
        }
        int start = arr[0];
        dfs(arr,0,start);
        System.out.println(max);
    }

    private static void dfs(int[] arr,int count,int start) {

        for(int i=0; i<arr.length; i++){
            if(!visited[i] && start<arr[i]){
                visited[i] = true;
                dfs(arr,count+1,start);
            }
        }
        System.out.println(count);
    }
}
