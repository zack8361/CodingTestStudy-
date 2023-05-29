package Programmers2단계;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 방문길이 {
    public static void main(String[] args) {
        String dirs = "LULLLLLLU";
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
        int cnt = 1;
        int[][] map = new int[11][11];
        boolean[][]visited = new boolean[11][11];
        ArrayDeque<Node> deque = new ArrayDeque<>();
        map[5][5] = 1;
        deque.add(new Node(5,5));
        for (int i = 0; i < dirs.length(); i++) {
            char ans = dirs.charAt(i);

            while (!deque.isEmpty()){
                Node now = deque.pollFirst();
                visited[now.x][now.y] = true;
                int nx = 0;
                int ny = 0;
                if(ans == 'U'){ // x축감소
                    nx = now.x - 1;
                    ny = now.y;
                }
                else if(ans == 'D'){ //x축증가
                    nx = now.x + 1;
                    ny = now.y;
                }
                else if(ans == 'L'){ //y축감소.
                    nx = now.x;
                    ny = now.y - 1;

                }
                else if(ans == 'R'){ // y축증가.
                    nx = now.x;
                    ny = now.y + 1;
                }

                if (nx<0 || ny<0 || nx>=map.length || ny>=map.length){
                    continue;
                }
                if(!visited[nx][ny]){
                    cnt++;
                    visited[nx][ny] = true;
                    deque.addLast(new Node(nx,ny));
                    map[nx][ny] = 1;
                    break;
                }
                else {
                    deque.addLast(new Node(nx,ny));
                    break;
                }
             }
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        return cnt ;
    }
}
