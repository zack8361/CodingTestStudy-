package Programmers2단계;

import java.util.HashMap;

public class KAKAOBLIND압축 {
    public static void main(String[] args) {
        String msg = "KAKAO";
        System.out.println(solution(msg));
    }

    private static int[] solution(String msg) {
        String[] alp = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < alp.length; i++) {
            map.put(alp[i],i+1);
        }

        for(int i=0; i<msg.length(); i++){


        }
        System.out.println(map);
        return new int[0];
    }
}
