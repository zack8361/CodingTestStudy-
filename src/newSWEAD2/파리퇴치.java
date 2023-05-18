package newSWEAD2;

import java.util.Scanner;

public class 파리퇴치 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < N-M+1; i++) {
                for (int j = 0; j < N-M+1; j++) {
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int l = 0; l < M; l++) {
                            sum += arr[i+k][j+l];
                        }
                    }
                    max = Math.max(max,sum);
                }
            }
            System.out.println(max);
        }
    }
}
