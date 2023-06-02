package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class N과M {
    private static int ans;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[M];
        dfs(N,M,"");
    }

    private static void dfs(int n, int m, String s) {
        if(s.length() == 4){
            System.out.println(s);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(visited[i+1]) {
                visited[i+1] = true;
                dfs(n, m, s + " " + i);
                visited[i+1] = false;
            }
        }
    }
}
