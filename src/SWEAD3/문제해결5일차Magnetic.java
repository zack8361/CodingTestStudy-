package SWEAD3;

import java.util.ArrayList;
import java.util.Arrays;

public class 문제해결5일차Magnetic {
    public static void main(String[] args) {
        String[][] map = {{"1","0","2","0","1","0","1"},
                {"0","2","0","0","0","0","0"},
                {"0","0","1","0","0","1","0"},
                {"0","0","0","0","1","2","2"},
                {"0","0","0","0","0","1","0"},
                {"0","0","2","1","0","2","1"},
                {"0","0","1","2","2","0","2"}
        };
        System.out.println(solution(map));
    }

    private static int solution(String[][] map) {

        int result = 0;
        String[] arr = new String[map.length];
        for (int i = 0; i < map.length; i++) {
            String answerStr ="";
            for (int j = 0; j < map[i].length; j++) {
                if(!map[j][i].equals("0")) {
                    answerStr += map[j][i];
                }
            }
            System.out.println("answerStr = " + answerStr);
            for (int j = 0; j < answerStr.length()-2+1; j++) {
                String a = String.valueOf(answerStr.charAt(j)) + String.valueOf(answerStr.charAt(j+1));
                if(a.equals("12")){
                    result++;
                }
            }
        }
        return result;
    }
}
