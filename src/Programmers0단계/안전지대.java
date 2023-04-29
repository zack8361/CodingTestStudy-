package Programmers0단계;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 안전지대 {
    // 상하 좌우 대각선 까지 전부 다따지는 좌표.
    private static int[] dx = {0,0,1,-1,-1,1,-1,1};
    private static int[] dy = {1,-1,0,0,1,1,-1,-1};
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,1,1,0},{0,0,0,0,0}};
        System.out.println(solution(board));
    }

    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int solution(int[][] board) {
        int N = board.length;
        int M = board[0].length;
        int[][] answer = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        ArrayDeque<Node> deque = new ArrayDeque<>();

        int count = 0;
        // 첫번째 좌표 찾아주고.
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(board[i][j] == 1){
                    deque.addLast(new Node(i,j));
                    while (!deque.isEmpty()){
                        Node now = deque.pollFirst();
                        answer[now.x][now.y] = 1;
                        for(int k=0; k<8; k++){
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];

                            if(nx<0 || ny<0 || nx>=N || ny>=M){
                                continue;
                            }
                            if(!visited[nx][ny] && board[nx][ny] == 0){
                                visited[nx][ny] = true;
                                answer[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }

        int count2 = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(answer[i][j] == 0){
                    count2++;
                }
            }
        }
        return count2;
    }
}
