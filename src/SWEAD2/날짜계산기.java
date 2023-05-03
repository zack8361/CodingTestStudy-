package SWEAD2;

import java.util.Scanner;

public class 날짜계산기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
                      //1//2//3//4//5//6//7//8//9//10//11//12
        int[] arr = {0,31,28,31,30,31,30,31,31,30, 31, 30, 31};
        for(int t=1; t<=N; t++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int answer = 0;
            answer+= arr[A] - B;
            for(int i=A+1; i<=C-1; i++){
                answer+=arr[i];
            }
            answer+=1;
            if(A!=C) {
                answer += D;
            }
            System.out.print("#"+t +" ");
            System.out.println(answer);

        }
    }
}
