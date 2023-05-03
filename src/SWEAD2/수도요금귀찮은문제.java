package SWEAD2;

import java.util.Scanner;

public class 수도요금귀찮은문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int P = sc.nextInt(); // A사 기본요금.
            int Q = sc.nextInt(); // B사 R리터 이하 기본요금. 총요금임 B사
            int R = sc.nextInt(); // R리터 리미트 이것 이하 내려가면 위에걸로 계산
            int S = sc.nextInt(); // B사 리터당 요금. R보다 넘어가면 계산
            int W = sc.nextInt(); // 총 물양

            int answer1 = P * W;
            int answer2 = Q;


            if(R<W){
                answer2 = Q + S *(W-R);
            }

            int min = Math.min(answer1,answer2);
            System.out.print("#"+t +" ");
            System.out.println(min);
        }
    }
}
