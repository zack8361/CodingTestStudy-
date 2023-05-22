package 주차1;

import java.util.Scanner;

public class 구간합구하기4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for (int j = a-1; j <=b-1; j++) {
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
