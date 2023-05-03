package SWEAD2;

import java.util.Scanner;

public class 쉬운거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] money = {50000, 10000, 5000, 1000, 500, 100,50, 10};
        int n = sc.nextInt();
        for(int t=1; t<=n; t++){
            int price = sc.nextInt();
            int answer =0;
            System.out.println("#" + t);
            for(int i=0; i<money.length; i++){
                answer = price/money[i];
                price %= money[i];
                System.out.print(answer+" ");
            }
            System.out.println();
        }
    }
}
