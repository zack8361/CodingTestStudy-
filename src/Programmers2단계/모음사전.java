package Programmers2단계;

import java.util.Arrays;
import java.util.HashMap;

public class 모음사전 {
    private static String[] output;
    private static int cnt = 0;
    private static boolean[] visited;
    private static HashMap<String ,Integer> map;
    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }

    private static int solution(String word) {
        int answer = 0;
        String[] alp = {"A","E","I","O","U"};
        output = new String[alp.length];
        visited = new boolean[alp.length];
        map = new HashMap<>();
        dfs(0,0,alp);
        System.out.println(map);
        return answer;
    }

    private static void dfs(int count,int depth ,String[] alp) {
        
        String s = "";
        for (int i = 0; i < output.length; i++) {
            s+=output[i];
        }
        map.put(s,cnt);
        cnt++;

        if(count == 5){
            return;
        }
        for (int i = 0; i < alp.length; i++) {
            if(!visited[i]){
                output[depth] = alp[i];
                dfs(count+1,depth+1,alp);
            }
        }
    }
}
