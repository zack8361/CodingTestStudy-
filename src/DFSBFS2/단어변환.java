package DFSBFS2;

import java.util.Arrays;

public class 단어변환 {
    private static int min = 1000;
    private static boolean[] visited;
    private static String answer;

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution(begin, target, words));
    }
    public static int solution(String begin, String target, String[] words) {
        answer = target;
        visited = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(!words[i].equals(target)) {
                    if (words[i].charAt(j) == begin.charAt(j)) {
                        count++;
                    }
                }
            }
            if(count == begin.length()-1){

                dfs(i,1,words,target,begin);
                visited[i] = false;
            }
        }

        if(min == 1000){
            return 0;
        }
        return min;
    }

    private static void dfs(int now, int cnt, String[] words, String target, String begin) {

        visited[now] = true;

        if(words[now].equals(target)){
            min = Math.min(min,cnt);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(!visited[i]) {
                    if (words[now].charAt(j) == words[i].charAt(j)) {
                        count++;
                    }
                }
            }
            if(count == begin.length()-1){
                if(!visited[i]) {
                    dfs(i,cnt+1,words,target, begin);
                    visited[i] = false;
                }
            }
        }
    }
}