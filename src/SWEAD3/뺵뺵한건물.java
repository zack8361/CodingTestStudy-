package SWEAD3;

import java.util.Arrays;
import java.util.Scanner;

public class 뺵뺵한건물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr =new int[N + 4];
        arr[0] = 0;
        arr[1] = 0;
        arr[arr.length-1] = 0;
        arr[arr.length-2] = 0;
        System.out.println(Arrays.toString(arr));

        for(int i=2; i<arr.length-2; i++){
            arr[i] = sc.nextInt();
        }
        int answer = 0;
        for(int i=2; i<arr.length-2; i++){
            int max = 0;

            if(arr[i-1]<arr[i] && arr[i-2]< arr[i] && arr[i]>arr[i+1] && arr[i]> arr[i+2]){
                System.out.println(Math.max(arr[i-2],arr[i+2]));
            }
        }
        System.out.println(answer);
        System.out.println(Arrays.toString(arr));
    }
}
