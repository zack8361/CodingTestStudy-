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
        for(int i=0; i<callings.length; i++) {
            if (map.containsKey(callings[i])) {
                int key = map.get(callings[i])-1;
                map.put(callings[i],map.get(callings[i])-1);
                for(int j=0; j<players.length; j++){
                    if(map.get(players[j]) == key){
                        map.put(players[j], key + 1);
                        break;
                    }
                }
            }
        }


        String[] str = new String[players.length];



        return str;
    }
}
