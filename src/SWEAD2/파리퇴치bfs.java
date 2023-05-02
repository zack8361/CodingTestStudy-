package SWEAD2;

import java.util.ArrayDeque;

public class 파리퇴치bfs {
    private static int[] dx = {0,1,1};
    private static int[] dy = {1,0,1};
    public static void main(String[] args) {
        int[][] map = {{1,3,3,6,7},{8,13,9,12,8},{4,16,11,12,6},{2,4,1,23,2},{9,13,4,7,3}};
        int M = 2;
        System.out.println(solution(map,M));
    }
    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int solution(int[][] map, int hit) {
        int N = map.length;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));
        while (!deque.isEmpty()){
            int answer = 0;
            Node now = deque.pollFirst();
            answer+=map[now.x][now.y];
            for(int i=0; i<3; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                answer+=map[nx][ny];
            }

            if (now.y + 2 < N ) {
                deque.addLast(new Node(now.x, now.y + 1));
            }

            else {
                deque.addLast(new Node(now.x + 1, 0));
            }

            System.out.println("now.x= " + now.x);
            System.out.println("now.y = " + now.y);
            System.out.println(answer);
        }
        return 0;
    }
}
