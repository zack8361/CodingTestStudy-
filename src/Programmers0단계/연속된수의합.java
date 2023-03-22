package Programmers0단계;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {
        int num = 4;
        int total = 14;
        System.out.println(solution(num,total));
    }

    private static int[] solution(int num, int total) {
        int mid = 0;

        mid = total/num;
        int count = num/2;

        int[] arr = new int[num];
        int a = 0;
        if(total%num == 0) {
            for (int i = mid - count; i <= mid + count; i++) {
                arr[a++] = i;
            }
            System.out.println(Arrays.toString(arr));
            return arr;
        }
        else {
            count = num/2 -1;
            for(int i=mid-count; i<=mid+count+1; i++){
                arr[a++] = i;
            }
            return arr;
        }

    }
}
