package Programmers1단계;

import java.util.*;

public class 달리기경주2 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(solution(players,callings));
    }

    private static String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();
        for(int i=0; i< players.length; i++){
            map.put(players[i],i);
            map2.put(i,players[i]);
        }

        for(int i=0; i<callings.length; i++){
            int key = map.get(callings[i]);//현재 사람의 인덱스.
            int frontKey = key-1; // 앞사람의 인덱스.
            String frontPer = map2.get(frontKey); // 앞사람 이름.

            map2.put(frontKey,callings[i]);
            map2.put(key,frontPer);
            map.put(callings[i],frontKey);
            map.put(frontPer,key);
        }
        String[] str = new String[players.length];
        for(int i=0; i<str.length; i++){
            str[i] = map2.get(i);
        }

        return str;
    }
}
