package DFSBFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class 조랭이문제 {
    // 상하 좌우 탐색을 위한 이동수단.
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    private static ArrayList<Integer> list = new ArrayList<>(); //개수 담기 위함.
    public static void main(String[] args) {
        String[][] map = {{"1","0","0","0"},{"1","0","0","0"},{"0","0","0","0"},{"0","0","1","1"}};
        System.out.println(solution(map));
    }
    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int solution(String[][] map) {

        int N = map.length;
        int M = map[0].length;
        boolean[][] visited = new boolean[N][M];
        int[][] map2 = new int[N][M];
        ArrayDeque<Node> deque = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        int totalCnt = 0;

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(!visited[i][j] && map[i][j].equals("1")){
                    totalCnt++;
                    int count = 0;
                    deque.addLast(new Node(i,j));
                    count++;
                    while (!deque.isEmpty()){
                        Node now = deque.pollFirst();
                        visited[now.x][now.y] = true;

                        for(int k=0; k<4; k++){
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];

                            if(nx<0 ||ny<0 || nx>=N || ny>=M){
                                continue;
                            }
                            if(!visited[nx][ny] && map[nx][ny].equals("1")){
                                count++;
                                visited[nx][ny] = true;
                                map2[nx][ny] = 1;
                                deque.addLast(new Node(nx,ny));
                            }
                        }
                    }
                    list.add(count);
                }
            }
        }
        System.out.println(totalCnt);
        int[] arr = new int[totalCnt];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return 0;
    }
}
