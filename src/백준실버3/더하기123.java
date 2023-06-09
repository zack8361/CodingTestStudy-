package 백준실버3;

import java.util.Scanner;


public class 더하기123 {
    private static int cnt = 0;
    public static void main(String[] args) {
        int N = 10;
        dfs(N,0);
        System.out.println("cnt = " + cnt);
    }

    private static void dfs(int num, int now) {
        if(now>=num){
            if(now == num){
                cnt++;
            }
            return;
        }
        dfs(num,now+1);
        dfs(num,now+2);
        dfs(num,now+3);
    }
}
