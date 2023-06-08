package DFSBFS2;

import java.util.Arrays;
import java.util.Scanner;

public class N과M {

    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N];
        dfs(N,M,"");
    }

    private static void dfs(int n, int m, String s) {


        if(s.length() == m) {
            System.out.println(Arrays.toString(visited));
            System.out.println(s);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(!visited[i-1]) {
                visited[i-1] = true;
                dfs(n, m, s + i);
                visited[i-1] =false;
            }
        }
    }
}
