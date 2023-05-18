package SWEAD3;

import java.util.Scanner;

public class 오셀로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tc 개수
        int T = sc.nextInt();
        //tc 만큼 iter
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][N];
            arr[arr.length/2-1][arr.length/2] = 1;
            arr[arr.length/2-1][arr.length/2-1] =2;
            arr[arr.length/2][arr.length/2-1] = 1;
            arr[arr.length/2][arr.length/2] = 2;
             for(int i=0; i<M; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                arr[arr.length-y][x-1] = z;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
