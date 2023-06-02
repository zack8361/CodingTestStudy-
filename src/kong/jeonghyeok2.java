package kong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class jeonghyeok2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int grade = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                        grade++;
                    }
                    else {
                        continue;
                    }
                }
            }
            sb.append(grade+1).append(" ");
        }
        System.out.println(sb);
    }
}
