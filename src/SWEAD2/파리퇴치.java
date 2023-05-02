package SWEAD2;

import java.util.Scanner;

public class 파리퇴치 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       for(int a=0; a<N; a++){
           int A = sc.nextInt();
           int[][] map = new int[A][A];
           int B = sc.nextInt();
           for(int i=0; i<A; i++){
               for(int j=0; j<A; j++){
                   map[i][j] = sc.nextInt();
               }
           }
       }
    }
}
