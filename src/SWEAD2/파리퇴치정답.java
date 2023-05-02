package SWEAD2;

import java.util.Scanner;

public class 파리퇴치정답 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i<=T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][N];
            int max = 0;

            //배열 입력
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    arr[j][k] = sc.nextInt();
                }
            }
            for(int a=0; a<N-M +1; a++){
                for(int b=0; b<N-M+1; b++){
                    int sum = 0;
                    for(int c=0; c<M; c++){
                        for(int d = 0; d<M; d++){
                            sum +=arr[a+c][b+d];
                        }
                    }
                     max = Math.max(max,sum);
                }
            }
            System.out.println(max);
        }
    }
}
