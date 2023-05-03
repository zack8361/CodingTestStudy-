package SWEAD2;

import java.util.Scanner;

public class 지그재그숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int A = sc.nextInt();
            int answer = 0;
            for(int i=1; i<=A; i++){
                if(i%2 == 1){
                    answer+=i;
                }
                else {
                    answer-=i;
                }
            }
            System.out.print("#" + t +" ");
            System.out.println(answer);
        }
    }
}
