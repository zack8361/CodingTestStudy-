package kong;

import java.util.Scanner;

public class jeonghyeok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending = {8,7,6,5,4,3,2,1};
        int[] arr = new int[8];
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ascending[i]){
                continue;
            }
            else {
                answer = 1;
                break;
            }
        }

        if(answer == 1){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == descending[i]){
                }
                else {
                    answer = 2;
                    break;
                }
            }
        }

        if(answer == 2){
            System.out.println("mixed");
        }
        else if(answer ==1){
            System.out.println("descending");
        }
        else {
            System.out.println("ascending");
        }

    }
}
