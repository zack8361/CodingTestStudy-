package SWEAD2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 배열회전하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int A = sc.nextInt();
            int[][] arr = new int[A][A];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + t +" ");
            for(int i=0; i<A; i++){
                for(int j=0; j<A; j++){
                    System.out.print(arr[A-j-1][i]);
                }
                System.out.print(" ");
                for(int j=0; j<A; j++){
                    System.out.print(arr[A-i-1][A-j-1]);
                }
                System.out.print(" ");
                for(int j=0; j<A; j++){
                    System.out.print(arr[j][A-1-i]);
                }
                System.out.println();
            }
        }
    }
}
