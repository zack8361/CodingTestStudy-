package Programmers2단계;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

public class 방문길이 {
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        System.out.println(solution(dirs));
    }

    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int solution(String dirs) {
        int cnt = 0;

        int[][] map = new int[21][21];
        boolean [][] visited = new boolean[21][21];
        map[10][10] = 2;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(10,10));
        for (int i = 0; i < dirs.length(); i++) {
            char ans = dirs.charAt(i);
            while (!deque.isEmpty()){
                Node now = deque.pollFirst();
                int nx = 0;
                int nx2 = 0;
                int ny = 0;
                int ny2 = 0;
                if(ans == 'U'){ // x축감소
                    nx = now.x - 1;
                    nx2 = now.x - 2;
                    ny = now.y;
                    ny2 = now.y;
                }
                else if(ans == 'D'){ //x축증가
                    nx = now.x + 1;
                    nx2 = now.x + 2;
                    ny = now.y;
                    ny2 = now.y;
                }
                else if(ans == 'L'){ //y축감소.
                    nx = now.x;
                    nx2 = now.x;
                    ny = now.y - 1;
                    ny2 = now.y -2;
                }
                else if(ans == 'R'){ // y축증가.
                    nx = now.x;
                    nx2 = now.x;
                    ny = now.y + 1;
                    ny2 = now.y + 2;
                }
                if(nx<0 || ny<0 || nx>=map.length || ny>=map.length){
                    deque.addLast(new Node(now.x,now.y));
                    break;
                }
                if(!visited[nx][ny]){
                    map[nx][ny] = 1;
                    map[nx2][ny2] = 2;
                    deque.addLast(new Node(nx2,ny2));
                    break;
                }
                else {
                    map[nx2][ny2] = 2;
                    deque.addLast(new Node(nx2,ny2));
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j] == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
