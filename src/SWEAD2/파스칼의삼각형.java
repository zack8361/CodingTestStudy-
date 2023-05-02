package SWEAD2;

import java.util.Scanner;

public class 파스칼의삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int a=1; a<=N; a++){
            int S = sc.nextInt();
            int[][] map = new int[S][S];
            for(int i=0; i<map.length; i++){
                map[i][0] = 1;
            }
            for(int i=1; i<map.length; i++){
                for(int j=1; j<map[0].length; j++){
                    map[i][j] = map[i-1][j] + map[i-1][j-1];
                }
            }
            System.out.println("#" + a);
            for(int i=0; i<map.length; i++){
                for(int j=0; j<map.length; j++){
                    if(map[i][j] != 0){
                        System.out.print(map[i][j] +" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
