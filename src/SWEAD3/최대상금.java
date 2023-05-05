package SWEAD3;

import java.util.Arrays;
import java.util.Scanner;

public class 최대상금 {
    private static boolean[] visited;
    static int max = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            String A = sc.next();
            int count = sc.nextInt();
            String[] str = A.split("");
            String[] output = new String[str.length];
            visited = new boolean[str.length];
            dfs(str,output,count,0);
            System.out.println(max);
        }
    }

    private static void dfs(String[] str, String[] output, int count, int depth) {

        if(depth == str.length){
            int cnt = 0;
            for(int i=0; i<output.length; i++){
                if(!str[i].equals(output[i])){
                    cnt++;
                }
            }
            int totalCnt = count*2;
            String answer = "";
            if(cnt == totalCnt){
                for(int i=0; i<output.length; i++){
                    answer+=output[i];
                }
                max = Math.max(max, Integer.parseInt(answer));
            }
        }

        for(int i=0; i<str.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = str[i];
                dfs(str,output,count,depth+1);
                visited[i] = false;
            }
        }
    }
}
