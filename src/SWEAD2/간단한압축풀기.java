package SWEAD2;

import java.util.Scanner;

public class 간단한압축풀기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int num = sc.nextInt();
            String answer ="";
            for(int i=0; i<num; i++){
                String A = sc.next();
                int B = sc.nextInt();
                for (int j = 0; j <B; j++) {
                    answer+=A;
                }
            }
            answer+=" ";
            int count = 0;
            System.out.println("#" + t);
            for(int i=0; i<answer.length(); i++){
                System.out.print(answer.charAt(i));
                count++;
                if(count%10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
