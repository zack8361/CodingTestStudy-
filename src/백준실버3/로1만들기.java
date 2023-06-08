package 백준실버3;

import java.util.Scanner;

public class 로1만들기 {
    private static int min = Integer.MAX_VALUE;
    private static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        dfs(n,0,m);

        System.out.println(min);
    }

    private static void dfs(int n, int cnt, int m) {

        if(n<1){
            return;
        }
        if(n == 1){
            min = Math.min(min,cnt);
            return;
        }

        if(n%2 ==0) {
            dfs(n/2,cnt+1,m);
        }
        if(n%3 ==0){
            dfs(n/3,cnt+1,m);
        }
        dfs(n-1,cnt+1,m);

    }
}
