package Programmers0단계;

public class 이차원배열순회하기 {
    public static void main(String[] args) {
        int[][] board = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};
        int k = 2;
        System.out.println(solution(board,k));
    }

    private static int solution(int[][] board, int k) {
        int answer = 0;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] <= k){
                    answer+=i +j ;

                }
            }
        }

        return answer;
    }
}
