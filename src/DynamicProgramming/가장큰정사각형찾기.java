package DynamicProgramming;

import java.util.Arrays;

public class 가장큰정사각형찾기 {
    public static void main(String[] args) {
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        System.out.println(solution(board));
    }

    private static int solution(int[][] board) {
        int answer = 0;

        int N = board.length;
        int M = board[0].length;



        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if(board[i][j] == 1){
                    board[i][j] += Math.min(board[i-1][j] , Math.min(board[i][j-1],board[i-1][j-1]));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                answer = Math.max(answer,board[i][j]);
            }
        }

        return  answer * answer;
    }
}
