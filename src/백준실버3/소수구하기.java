package 백준실버3;

import java.util.Scanner;

public class 소수구하기 {
    private static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if(M == 2){
            answer = 1;
        }
        else {
            for (int i = N; i <= M; i++) {
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <num; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
