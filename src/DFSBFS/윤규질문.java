package DFSBFS;

import java.util.ArrayList;
import java.util.Arrays;

public class 윤규질문 {

    private static int count = 0;
    private static boolean[] visited;
    private static String[] str;
    public static void main(String[] args) {
        String[] arr = {"1","2"};
        System.out.println(solution(arr));
    }

    private static int solution(String[] arr) {
        int answer = 1;
        visited = new boolean[arr.length];
        str = new String[arr.length];
        dfs(0,arr);
        return 1000;
    }

    private static void dfs(int depth, String[] arr) {

        
        int count = 0;
        if(depth == arr.length){
            System.out.println(Arrays.toString(str));
        }
        for(int i=0; i<2; i++){
            if(!visited[i]){
                visited[i] = true;
                str[depth] = arr[i];
//                dfs(depth+1,arr); // 첫번째 재귀호출시
                for(int j=0; j<2; j++){
                    if(!visited[j]){
                        visited[j] = true;
                        str[depth] = arr[j];
                        dfs(depth+1,arr); // 첫번째 재귀호출시
                        visited[j] = false; // 이걸 이해를 못하는거야
                    }
                }
                visited[i] = false; // 이걸 이해를 못하는거야
            }
        }
    }
}
