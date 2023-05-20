package 백준실버2;

import java.util.Scanner;

public class 연속합 {
    private static int[] output;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        visited = new boolean[N];
        output = new int[arr.length];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            dfs(arr,0,0,i+1);
        }
    }

    private static void dfs(int[] arr, int start, int depth, int r) {
        if(depth == r){
            for(int i=0; i<arr.length; i++){
                if(visited[i]){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        for(int i=start; i<arr.length; i++){
            if (!visited[i]){
                visited[i] = true;
                dfs(arr,start+1,depth+1,r);
                visited[i] = false;
            }
        }
    }

}
