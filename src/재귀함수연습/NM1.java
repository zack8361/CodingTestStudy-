package 재귀함수연습;

import java.util.Arrays;
import java.util.Scanner;

public class NM1 {
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //3
        int M = sc.nextInt(); //1
        visited = new boolean[N];

        dfs(0,N,M,"");
    }

    private static void dfs(int now ,int n, int m, String s) {
        if(s.length() == m + m){
            System.out.println(s.substring(1, m + m));
            return;
        }

        for (int i = now + 1; i <= n; i++) {
                dfs(i,n,m,s +" "+i);

        }
    }
}
