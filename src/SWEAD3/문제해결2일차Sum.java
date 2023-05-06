package SWEAD3;

import java.util.Scanner;

public class 문제해결2일차Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int t=1; t<=tc; t++){
            int[][] map = new int[100][100];

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            int max2 = 0;
            for (int i = 0; i < map.length; i++) {
                int answer = 0;
                int answer2 = 0;
                for (int j = 0; j < map.length; j++) {
                    answer+=map[j][i];
                    answer2+=map[i][j];
                }
                max = Math.max(max,answer);
                max2 = Math.max(max2,answer2);
            }
            int totalMax = Math.max(max,max2);
            System.out.println("#" + t + " " +totalMax);
        }
    }
}
