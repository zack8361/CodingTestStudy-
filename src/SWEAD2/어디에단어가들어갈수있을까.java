package SWEAD2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class 어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        int[][] map = {{0,0,1,1,1},{1,1,1,1,0},{0,0,1,0,0},{0,1,1,1,1},{1,1,1,0,1}};
        int N = 3;
        System.out.println(solution(map,N));
    }

    private static int solution(int[][] map, int n) {

        int totalCnt = 0;
        String result = "";
        for(int i=0; i<n; i++){
            result+="1";
        }
        for(int i=0; i<map.length; i++) {
            int count = 0;
            String str = "";
            for (int j = 0; j < map[0].length; j++) {
                str += map[i][j];
            }
            String[] answer = str.split("0");
            for(int j=0; j<answer.length; j++){
                if(answer[j].equals(result)){
                    count++;
                }
            }
        }

        return 0;
    }
}
