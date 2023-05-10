package 백준실버4;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 3;
        int B = 5;
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                break;
            } else {
                n -= 3;
                count++;
            }
            if (n < 0) {
                System.out.println("-1");
                break;

            }
        }
    }
}
