package DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

public class 백준쿼드트리현대문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];

        for(int i=0; i<N; i++){
            str[i] = sc.next();
        }

        String[][] map = new String[N][N];
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str.length; j++){
                map[i][j] = String.valueOf(str[i].charAt(j));
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(Arrays.toString(map[i]));
        }
    }
}
