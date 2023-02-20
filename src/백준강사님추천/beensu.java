package 백준강사님추천;

import java.util.*;

public class beensu {
    public static void main(String[] args) {
        int[] array = {1,1,2,2};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int max = 0;
        int[] arr = new int[1000];
        int answer = arr[0];

        for(int i=0; i<array.length; i++){
            arr[array[i]]++;
            if(max<arr[array[i]]){
                max = arr[array[i]];
                answer = array[i];
            }
        }
        int temp = 0;

        for(int i=0; i<1000; i++){
            if(max == arr[i]){
                temp++;
            }
            if(temp>1){
                return -1;
            }
        }


        return answer;
    }
}
