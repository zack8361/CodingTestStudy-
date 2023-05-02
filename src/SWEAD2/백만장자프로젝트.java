package SWEAD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백만장자프로젝트 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int a=0; a<N; a++){
            int M = sc.nextInt();
            int[] arr = new int[M];
            for(int i=0; i<M; i++){
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int count = 0;
            int answer = 0;
            for(int i=0; i<arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            for(int i=0; i<arr.length; i++){

                if(arr[i] < max){
                    count++;
                    answer-=arr[i];
                }
                else if(arr[i] == max){
                    answer = answer+(count*arr[i]);
                    max = 0;
                }
            }
            System.out.println(answer);
        }
    }
}
