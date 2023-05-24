package 주차4;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 거리두기확인하기 {
    public static void main(String[] args) {
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(solution(places));
    }
    private static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
    private static int[] solution(String[][] places) {
        for(int t=0; t<places.length; t++){
            String[][] map = new String[places.length][places[0].length];

//          여기 까지 입력.
            for(int i=0; i<map.length; i++){
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = String.valueOf(places[t][i].charAt(j));
                }
            }

            boolean[][]visited = new boolean[map.length][map[0].length];
            ArrayDeque<Node> deque = new ArrayDeque<>();

//          여기 부터 시작
            for(int i=0; i<map.length; i++){
                for (int j = 0; j < map[i].length; j++) {

                }
            }

        }
        return new int[0];
    }
}
