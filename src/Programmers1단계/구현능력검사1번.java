package Programmers1단계;

import java.util.Arrays;

public class 구현능력검사1번 {
    public static void main(String[] args) {
        int[][] M = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[] S = {0, 0};
        int[] D = {1, 2};
        System.out.println(solution(M,S,D));

    }

    public static int go(int[][] cloneM, int[] d, int[] n, int count) {
        int answer = -1;
        int[][] m = Arrays.stream(cloneM).map(int[]::clone).toArray(int[][]::new);

        if(n[0] == d[0] && n[1] == d[1]) {
            System.out.println(count);
            return count;
        }
        else {
            m[n[0]][n[1]] = 1;
            for(int i=0; i<m.length; i++) {
                for(int j=0; j<m[0].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();


        try {
            if(m[n[0]-1][n[1]] != 1) { //상
                int [] tempN = {n[0]-1, n[1]};

                int result = go(m, d, tempN, count+1);
                if (answer == -1 || answer > result) {
                    answer = result;
                }
            }
        } catch (Exception e) {}

        try {
            if(m[n[0]+1][n[1]] != 1) { //하
                int [] tempN = {n[0]+1, n[1]};

                int result = go(m, d, tempN, count+1);
                if (answer == -1 || answer > result) {
                    answer = result;
                }
            }
        } catch (Exception e) {}

        try {
            if(m[n[0]][n[1]-1] != 1) { //좌
                int [] tempN = {n[0], n[1]-1};

                int result = go(m, d, tempN, count+1);
                if (answer == -1 || answer > result) {
                    answer = result;
                }
            }
        } catch (Exception e) {}

        try {
            if(m[n[0]][n[1]+1] != 1) { //우
                int [] tempN = {n[0], n[1]+1};

                int result = go(m, d, tempN, count+1);
                if (answer == -1 || answer > result) {
                    answer = result;
                }
            }
        } catch (Exception e) {}


        return answer;
    }
    public static int solution(int [][] m, int[] s, int[] d) {
        int [] n = {s[0], s[1]};
        return go(m, d,n, 0);
    }
}