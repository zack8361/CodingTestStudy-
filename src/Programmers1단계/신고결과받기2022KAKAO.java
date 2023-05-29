package Programmers1단계;

import java.lang.reflect.Array;
import java.util.*;

public class 신고결과받기2022KAKAO {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","muzi frodo"};
        int k = 2;
        System.out.println(solution(id_list,report,k));
    }

    private static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String , HashSet<String>> map =  new HashMap<>();
        HashMap<String,Integer> count = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String[] str = report[i].split(" ");
            map.putIfAbsent(str[0],new HashSet<>(){{add(str[1]);}});
            map.get(str[0]).add(str[1]);
        }


        return answer;
    }
}
