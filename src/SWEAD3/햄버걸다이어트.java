package SWEAD3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 햄버걸다이어트 {
    static HashMap<Integer,Integer> map;
    private static int limit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // tc 갯수
        for(int t =1; t<=tc; t++){
            int N = sc.nextInt();
            limit = sc.nextInt();
            map = new HashMap<>();
            int[] taste = new int[N];
            int[] cal = new int[N];
            boolean[] visited = new boolean[N];
            for(int i=0; i<N; i++){
                taste[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }
            for(int i=0; i<taste.length; i++){
                dfs(taste,cal,visited,0,0,i+1);
            }
            int max = 0;
            int max2 = 0;
            for(int i:map.keySet()){
                if(i>max){
                    max = i;
                    max2 = map.get(i);
                }
            }
            System.out.println("#" + t +" "+max2);
        }
    }

    private static void dfs(int[] taste, int[] cal, boolean[] visited, int start, int depth, int r) {
        if(depth == r){
            int sum = 0;
            int sum2 = 0;
            for(int i=0; i<taste.length; i++){
                if(visited[i]){
                    sum+=cal[i];
                    sum2+=taste[i];
                }
            }
            if(sum<limit){
                map.put(sum,sum2);
            }
        }
        for(int i=start; i<taste.length; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(taste,cal,visited,i+1,depth+1,r);
                visited[i] = false;
            }
        }
    }
}
