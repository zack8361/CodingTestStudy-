package SWEAD3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 붕어빵문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // tc 개수
        for(int t=1; t<=tc; t++){
            boolean flag = false;
            int N = sc.nextInt(); // 총 2명의 손님이 온다.
            int M = sc.nextInt(); // 초당
            int K = sc.nextInt(); // 몇개의 붕어빵을 만들수 있는지.
            int[] guest = new int[N];
            for(int i= 0; i<guest.length; i++){
                guest[i] = sc.nextInt();
            }
            Arrays.sort(guest);
            System.out.println(Arrays.toString(guest));
            for(int i=0; i<guest.length; i++){
                if(guest[i]< M){
                    flag = true;
                    break;
                }
                else if(guest[i] >= M){
//                    if(guest[i]% )
                }
            }

            if(flag){
                System.out.println("Impossible");
            }
            else {
                System.out.println("Possible");
            }
        }
    }
}
