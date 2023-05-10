package 백준실버4;

import java.util.Arrays;
import java.util.Scanner;

public class 한수 {
    private static int totalSum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr= new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            dfs(arr, 0, 0,i);
        }
        System.out.println(totalSum);
    }

    private static void dfs(int[] arr, int depth, int sum, int i) {
        if(depth == i+1){
            totalSum+=sum;
            return;
        }
        dfs(arr,depth+1,sum+arr[depth],i);
    }
}
