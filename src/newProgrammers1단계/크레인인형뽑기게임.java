package newProgrammers1단계;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int[] moves = {1,2,3,4};
        System.out.println(solution(board,moves));
    }

    private static int solution(int[][] board, int[] moves) {

//        moves 배열 0번 으로 바꿔주기.
        for (int i = 0; i < moves.length; i++) {
            moves[i] = moves[i] - 1;
        }
//        move 뽀아보자

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] arr = new int[moves.length];
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i]] != 0){
                    arr[i] = board[j][moves[i]];
                    board[j][moves[i]] = 0;
                    break;
                }
            }
        }


        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(deque.isEmpty()){
                deque.addLast(arr[i]);
            }
            else {
                if(deque.peekLast() != 0 && deque.peekLast() == arr[i]){
                    cnt++;
                    deque.pollLast();
                }
                else {
                    deque.addLast(arr[i]);
                }
            }
        }

        return cnt*2;
    }
}
