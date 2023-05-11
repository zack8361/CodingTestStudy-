package 백준실버4;

import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=N; i<=M; i++){
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            System.out.println(i);
        }
    }
}
