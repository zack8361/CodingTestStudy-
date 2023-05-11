package 백준실버4;

import java.util.Scanner;

public class 만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;

        while (N!=1){
            if((N-1) %3 == 0){
                N-=1;
                count++;
            }
            if(N%3 == 0){
                count++;
                N/=3;
            }
            else if(N%2 == 0){
                count++;
                N/=2;
            }
            else {
                N-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
