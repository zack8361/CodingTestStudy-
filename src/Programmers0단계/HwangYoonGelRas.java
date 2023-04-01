package Programmers0단계;

public class HwangYoonGelRas {
    public static void main(String[] args) {
        int[] startPoint = {0,0};
        String[] maze = {"OXOXG","OXOOO","OXXOX","OOOOO","XOXXO"};
        System.out.println(solution(startPoint,maze));
    }

    private static int solution(int[] startPoint, String[] maze) {

        String[][] map = new String[maze.length][maze[0].length()];

        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length(); j++){
                map[i][j] = String.valueOf(maze[i].charAt(j));
            }
        }
        int x = startPoint[0];
        int y = startPoint[1];

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                if(map[x][y+1].equals("X")){
                    y +=1;
                }
            }
        }

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        return 0;
    }
}
