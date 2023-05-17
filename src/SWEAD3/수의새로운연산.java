package SWEAD3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 수의새로운연산 {
    private static int[] dx = {-1};
    private static int[] dy = {1};

    private static boolean[][]visited;
    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc<=T; tc++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[][] arr = new int[300][300];
            visited = new boolean[arr.length][arr.length];
            ArrayDeque<Node> deque = new ArrayDeque<>();

            deque.add(new Node(0,0));
            while (!deque.isEmpty()){
                Node now = deque.pollFirst();
//                arr[now.x][now.y] =
                for(int i=0; i<1; i++){
                    int nx = now.x + dx[i];
                    int ny = now.y + dy[i];

                    if(nx<0 || ny<0 || nx>=arr.length || ny >=arr.length){

                    }

                }

            }
            int a = 1;

        }
    }
}
