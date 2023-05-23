package 주차1;

import java.util.Arrays;

public class 줄서는방법 {
    private static int[] answer;
    private static int[] output;
    private static boolean[] visited;
    private static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        int k = 5;
        System.out.println(solution(n,k));
    }

    private static int[] solution(int n, long k) {
        answer = new int[n];
        visited = new boolean[n];
        output = new int[n];
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        dfs(k,0,arr);
        return answer;
    }

    private static void dfs(long k, int depth,int[] arr) {
        if(depth == output.length){
            count++;
            if(count == k){
                for(int i=0; i<output.length; i++){
                    answer[i] = output[i];
                }
                return;
            }
        }
        for(int i=0; i<output.length; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                dfs(k,depth+1,arr);
                visited[i] = false;
            }
        }
    }
}
