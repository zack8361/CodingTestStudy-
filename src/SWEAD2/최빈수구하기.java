package SWEAD2;

import java.util.HashMap;
import java.util.Scanner;

public class 최빈수구하기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,2,3,3,2,3,2,7,4,5,4,3,7,8,3,2,1};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
        int max = -1;
        int key = 0;
        for(int i: map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                key = i;
            }
        }
        System.out.println(key);
        return 0;
    }
}
