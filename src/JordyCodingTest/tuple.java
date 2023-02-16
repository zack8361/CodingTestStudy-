package JordyCodingTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tuple {
    public static void main(String[] args) {
        String[] keyinput = {"down","down","down","down","down"};
        int[] board = {7,9};
        System.out.println(solution(keyinput,board));

    }

    private static int[] solution(String[] keyinput, int[] board) {

        int[] answer = new int[2];
        int x = board[0]/2;
        int y = board[1]/2;

        int gameX = 0;
        int gameY = 0;


        for(int i=0; i<keyinput.length; i++){
            if(gameX>-x) {
                if (keyinput[i].equals("left")) {
                    gameX = gameX - 1;
                }
            }
            if(gameX<x) {
                if (keyinput[i].equals("right")) {
                    gameX = gameX + 1;
                }
            }
                if(gameY<y) {
                    if (keyinput[i].equals("up")) {
                        gameY = gameY + 1;
                    }
                }
                if(gameY>-y) {
                    if (keyinput[i].equals("down")) {
                        gameY = gameY - 1;
                    }
                }
        }

        board[0] = gameX;
        board[1] = gameY;
        System.out.println(Arrays.toString(board));
        return board;
    }
}
