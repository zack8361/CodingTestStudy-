package Programmers2단계;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class 배열자르기2 {
    private static int[] dx = {0,0,1,-1,-1,1,-1,1};
    private static int[] dy = {1,-1,0,0,1,1,-1,-1};
    public static void main(String[] args) {
        int n = 3;
        int left = 2;
        int right = 5;
        System.out.println(solution(n,left,right));
    }

    private static class Node{
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] solution(int n, long left, long right) {
        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[][] newMap = new int[n][n];
        map[0][0] = 1;
        newMap[0][0] = 1;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));

        while (!deque.isEmpty()){
            Node now = deque.pollFirst();
            visited[now.x][now.y] = true;
            for(int i=0; i<8; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx<0 || ny<0 || nx>=n || ny>=n ){
                    continue;
                }
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    newMap[nx][ny] = newMap[now.x][now.y] + 1;
                    deque.addLast(new Node(nx,ny));
                }

            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                list.add(newMap[i][j]);
            }
        }
        int[] answer = new int[(int) (right-left+1)];
        int a = 0;
        for(long i=left; i<=right; i++){
            answer[a++] = list.get((int) i);
        }
        return answer;
    }
}
