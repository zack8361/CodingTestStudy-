package SWEAD2;

import java.util.Scanner;

public class 두개의숫자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int t=1; t<=N; t++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[] arrA = new int[A];
            int[] arrB = new int[B];

            for(int i=0; i<arrA.length; i++){
                arrA[i] = sc.nextInt();
            }
            for(int i=0; i<arrB.length; i++){
                arrB[i] = sc.nextInt();
            }
            int max = 0;
            if(A>B){
                for(int i=0; i<A-B+1; i++){
                    int answer = 0;
                    for(int j=0; j<B; j++){
                        answer += arrB[j] * arrA[j+i];
                    }
                    max = Math.max(max,answer);
                }
            }
            else if(A<B){
                for(int i=0; i<B-A+1; i++){
                    int answer = 0;
                    for(int j=0; j<A; j++){
                        answer+= arrA[j] * arrB[j+i];
                    }
                    max = Math.max(max,answer);
                }
            }
            else {
                for(int i=0; i<B; i++){
                    max +=arrA[i] * arrB[i];
                }
            }
            System.out.print("#" + t +" ");
            System.out.println(max);
        }
    }
}
