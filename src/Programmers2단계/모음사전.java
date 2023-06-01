package Programmers2단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 모음사전 {
    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }

    private static String[] arr;
    private static ArrayList<String> list;

    private static int solution(String word) {
        list=new ArrayList<>();
        arr = new String[]{"A", "E", "I", "O", "U"};
        int answer = 0;
        dfs(word,"",0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)){
                answer = i;
            }
        }
        return answer;
    }

    private static void dfs(String word, String str, int depth) {
        list.add(str);
        System.out.println("str = " + str);
        if(depth == 5){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            dfs(word,str + arr[i],depth+1);
        }

    }
}
