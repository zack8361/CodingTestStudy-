package Programmers1단계;

import java.util.*;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(solution(players,callings));
    }

    private static String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i],i);
        }
        System.out.println(map);
        for(int i=0; i<callings.length; i++) {
            if (map.containsKey(callings[i])) {
                int key = map.get(callings[i])-1;
                String per = players[key];
                System.out.println(per);
                map.put(per,map.get(per) +1);
                map.put(callings[i], map.get(callings[i]) - 1);
                map.replace(callings[i], map.get(callings[i]) - 1);
            }
        }

        System.out.println(map);
        String[] str = {};
        return str;
    }
}
