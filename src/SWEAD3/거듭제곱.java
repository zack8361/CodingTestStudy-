package SWEAD3;

import java.util.Scanner;

public class 거듭제곱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc<=10; tc++){
            int t = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            dfs(a,b,0,1);
        }
    }

    private static void dfs(int a, int b, int depth,int sum) {
        if(depth == b){
            System.out.println(sum);
            return;
        }
        dfs(a,b,depth+1,sum*a);
    }
}
