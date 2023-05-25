package 주차4;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 거리두기확인하기 {
    private static String[][] map;
    private static boolean[][]visited;
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
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

        int[] answer = new int[places.length];
        for(int t=0; t<places.length; t++){
            map = new String[places.length][places[0].length];
//          여기 까지 입력.
            for(int i=0; i<map.length; i++){
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = String.valueOf(places[t][i].charAt(j));
                }
            }

            visited = new boolean[map.length][map[0].length];
            ArrayDeque<Node> deque = new ArrayDeque<>();

//          여기 부터 시작
            boolean flag = false;
            for(int i=0; i<map.length; i++){
                for (int j = 0; j < map[i].length; j++) {
                    if(!visited[i][j] &&map[i][j].equals("P")) {
                        deque.addLast(new Node(i, j));
                        visited[i][j] = true;
                        if(!check(deque)){
                            flag = true;
                        }
                    }
                }
                if(flag){
                    break;
                }
            }

            if(flag){
                answer[t] = 0;
            }
            else {
                answer[t] = 1;
            }
        }

        return answer;
    }

    private static boolean check(ArrayDeque<Node> deque) {

        while (!deque.isEmpty()){
            Node now = deque.pollFirst();
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];


                if(nx<0 || ny<0 || nx>= map.length || ny>=map[0].length || map[nx][ny].equals("X")){
                    continue;
                }
                if(map[nx][ny].equals("O")){
                    if(nx > now.x){
                        for (int j = 1; j < 3; j++) {
                            if(nx+j>=map.length || map[nx+j][ny].equals("O")){
                                continue;
                            }
                            if(map[nx+j][ny].equals("X")){
                                return true;
                            }
                            if(map[nx+j][ny].equals("P")){
                                return false;
                            }
                        }
                    }
                    else if(nx< now.x){
                        for (int j = 1; j < 3; j++) {
                            if(nx-j<0 || map[nx-j][ny].equals("O")){
                                continue;
                            }
                            if(map[nx-j][ny].equals("X")){
                                return true;
                            }
                            if(map[nx-j][ny].equals("P")){
                                visited[nx-j][ny] = true;
                                return false;
                            }
                        }
                    }
                    else if(ny>now.y){
                        for (int j = 1; j < 3; j++) {
                            if(ny+j>=map[0].length || map[nx][ny+j].equals("O")){
                                continue;
                            }
                            if(map[nx][ny+j].equals("X")){
                                return true;
                            }
                            if(map[nx][ny+j].equals("P")){
                                return false;
                            }
                        }
                    }
                    else if(ny < now.y){
                        for (int j = 1; j < 3; j++) {
                            if(ny-j<0 || map[nx][ny-j].equals("O")){
                                continue;
                            }
                            if(map[nx][ny-j].equals("X")){
                                return true;
                            }
                            if(map[nx][ny-j].equals("P")){
                                return false;
                            }

                        }
                    }
                }
            }
        }
        return true;
    }
}
