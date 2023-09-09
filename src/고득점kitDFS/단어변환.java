package 고득점kitDFS;

import java.util.Arrays;

public class 단어변환 {
    private static int cnt;
    private static String ans;
    private static String[] map;
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};
        System.out.println(solution(begin,target,words));
    }

    private static int solution(String begin, String target, String[] words) {

        ans = begin;
        map = words;
        for (int i = 0; i < words.length; i++) {
            if(check(words[i])){

            }
            else {
                continue;
            }
        }
        return cnt;
    }

    private static boolean check(String word) {

        return false;
    }

    private static void dfs(String word) {


        System.out.println();
    }
}
