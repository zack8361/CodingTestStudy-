package Programmers0단계;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(solution(wallpaper));
    }

    private static int[] solution(String[] wallpaper) {
        String[][] str = new String[wallpaper.length][wallpaper[0].length()];

        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                str[i][j] = String.valueOf(wallpaper[i].charAt(j));
            }
        }
        int minX = 51;
        int minY = 51;
        int maxX = -1;
        int maxY = -1;
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str[0].length; j++){
                if(str[i][j].equals("#")){
                    if(maxX<i){
                        maxX = i;
                    }
                    if(maxY<j){
                        maxY = j;
                    }
                    if(minY>j){
                        minY = j;
                    }
                    if(minX>i){
                        minX = i;
                    }
                }
            }
        }
        int[] arr= new int[4];
        arr[0] = minX;
        arr[1] = minY;
        arr[2] = maxX+1;
        arr[3] = maxY+1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
