package newProgrammers;

public class 안전지대 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(board));
    }

    private static int solution(int[][] board) {
        int cnt = 0;
        int total = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    if(i!=0 && board[i-1][j] == 0){
                        board[i-1][j] = 2;
                        cnt++;
                    }
                    if(i!=0 && j!=0 && board[i-1][j-1] == 0){
                        cnt++;
                        board[i-1][j-1] = 2;
                    }
                    if(i!=0 && j!= board.length-1 && board[i-1][j+1] == 0){
                        cnt++;
                        board[i-1][j+1] = 2;
                    }
                    if(j!= 0 && board[i][j-1] == 0){
                        cnt++;
                        board[i][j-1] =2;
                    }
                    if(j!= board.length-1 &&board[i][j+1] == 0){
                        cnt++;
                        board[i][j+1] =2;
                    }
                    if(i!= board.length-1 &&board[i+1][j] ==0){
                        cnt++;
                        board[i+1][j] =2;
                    }
                    if(i!= board.length-1 && j!=0 &&board[i+1][j-1] == 0){
                        cnt++;
                        board[i+1][j-1] =2;
                    }
                    if(i!=board.length-1 && board[i+1][j] == 0){
                        cnt++;
                        board[i+1][j] =2;
                    }
                    if(i!=board.length-1 && j!=board.length-1 &&board[i+1][j+1] == 0){
                        cnt++;
                        board[i+1][j+1] =2;
                    }

                }
                else {
                    total++;
                }
            }
        }
        System.out.println(cnt);
        return total-cnt;
    }
}
