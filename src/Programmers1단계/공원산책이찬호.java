package Programmers1단계;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 공원산책이찬호 {

    private static int x = 0;
    private static int y = 0;

    public static void main(String[] args) {
        String[] park = {"SOO","OXX","OOO"};
        String[] routes ={"E 2","S 2","W 1"};
        System.out.println(solution(park,routes));
    }

    private static int[] solution(String[] park, String[] routes) {
        int N = park.length;
        int M = park[0].length();
        String[][] map = new String[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = String.valueOf(park[i].charAt(j));
            }
        }
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                if(map[i][j].equals("S")){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        for(int i=0; i<routes.length; i++){
            String dir = String.valueOf(routes[i].charAt(0));
            int num = Integer.parseInt(String.valueOf(routes[i].charAt(2)));

            if(dir.equals("E")){ //  동
                for(int j=1; j<=num; j++){
                    int nx = x;
                    int ny = y+1;
                    if(nx<0 || ny<0 || nx>=map.length || ny>=map.length || map[nx][ny].equals("X")){

                        x = nx;
                        y = ny-j;
                        break;
                    }
                    else {
                        x = nx;
                        y = ny;
                    }
                }
            }
            else if(dir.equals("W")){ // 서
                for(int j=1; j<=num; j++){
                    int nx = x;
                    int ny = y-1;
                    if(nx<0 || ny<0 || nx>=map.length || ny>=map.length || map[nx][ny].equals("X")){
                        x = nx;
                        y = ny+j;
                        break;
                    }
                    else {
                        x = nx;
                        y = ny;
                    }
                }

            }
            else if(dir.equals("S")){ // 남
                for(int j=1; j<=num; j++){
                    int nx = x+1;
                    int ny = y;
                    if(nx<0 || ny<0 || nx>=map.length || ny>=map.length || map[nx][ny].equals("X")){
                        x = nx-j;
                        y = ny;
                        break;
                    }
                    else {
                        x = nx;
                        y = ny;
                    }
                }

            }
            else if(dir.equals("N")){ //북
                for(int j=1; j<=num; j++){
                    int nx = x-1;
                    int ny = y;
                    if(nx<0 || ny<0 || nx>=map.length || ny>=map.length || map[nx][ny].equals("X")){
                        x = nx +j;
                        y = ny;
                        break;
                    }
                    else {
                        x = nx;
                        y = ny;
                    }
                }
            }
        }
        int[] answer = {x,y};
        return answer;
    }
}
