package SWEAD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최장경로 {
    private static boolean[] visited;
    private static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc<=T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            visited = new boolean[N];

            // 배열 하나 만들어주.
            int[][] arr = new int[N][N];
            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                arr[A-1][B-1] = 1;
                arr[B-1][A-1] = 1;
            }
            for(int i=0; i<N; i++){
                System.out.println(Arrays.toString(arr[i]));
            }
            for(int i=0; i<N; i++){
                dfs(i,1,arr);
                visited[i] = false;
            }
            System.out.println("#" + T + " " + max);
        }
    }

    private static void dfs(int now, int cnt,int[][] arr) {
        visited[now] = true;

        for(int i=0; i<arr.length; i++){
            if(arr[now][i] == 1 && !visited[i]){
                dfs(i,cnt+1,arr);
                visited[i] = false;
            }
        }
        max = Math.max(max,cnt);
    }
}
