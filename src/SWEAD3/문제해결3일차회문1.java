package SWEAD3;

import java.util.Arrays;
import java.util.Scanner;

public class 문제해결3일차회문1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int t = 1; t<=10; t++) {
            int N = sc.nextInt();
            String[] str = new String[8];
            // 문자열 입력.
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.next();
            }
            String[][] map = new String[8][8];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = String.valueOf(str[i].charAt(j));
                }
            }

            int result = 0;

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < 8 - N + 1; j++) {
                    String answer = "";
                    String answer2 = "";
                    String answer3 = "";
                    String answer4 = "";
                    for (int k = 0; k < N; k++) {
                        answer += map[i][k + j];
                        answer3 += map[j + k][i];
                    }
                    for (int k = N - 1; k >= 0; k--) {
                        answer2 += map[i][k + j];
                        answer4 += map[j + k][i];
                    }
                    if (answer.equals(answer2)) {
                        result++;
                    }
                    if (answer3.equals(answer4)) {
                        result++;
                    }
                }
            }
            System.out.print("#" + t + " ");
            System.out.println(result);
        }
    }
}
