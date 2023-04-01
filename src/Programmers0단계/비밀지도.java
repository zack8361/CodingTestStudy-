package Programmers0단계;

import java.util.ArrayList;
import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 ={30,1,21,17,28};
        System.out.println(solution(n,arr1,arr2));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            for(int i=0; i<arr1.length; i++){
                String str = Integer.toBinaryString(arr1[i] | arr2[i]);
                str = str.replace("1","#");
                str = str.replace("0"," ");
                str = str.replace(" "," ");
                answer[i] = str;
            }
            return answer;
        }
    }
