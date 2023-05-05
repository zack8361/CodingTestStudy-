package SWEAD3;

import java.util.Scanner;

public class 준환이의운동관리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <=N; i++) {
            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();

            int min = Math.min(L,U); // 최소
            int max = Math.max(L,U); // 최대

            int answer = 0;
            if(X<= min) {
                answer = min-X;
            }
            else if(min<=X && X<=max){
                answer = 0;
            }
            else if(X>max){
                answer = -1;
            }
            System.out.println("#" + i +" " + answer);

        }
    }
}
