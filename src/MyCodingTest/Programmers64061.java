package MyCodingTest;

import java.util.Stack;

/**
 * 2019 카카오 개발자 겨울 인턴십
 * 크레인 인형뽑기 게임 (Lv.1)
 */
public class Programmers64061 {
    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }

    private static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board[0].length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    if(stack.isEmpty()){
                        stack.push(board[j][moves[i]-1]);
                    }
                    else {
                        if(stack.peek() == board[j][moves[i]-1]){
                            stack.pop();
                            answer+=2;
                        }
                        else {
                            stack.push(board[j][moves[i]-1]);
                        }
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
