package Programmers0단계;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class 배열조각하기 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        System.out.println(solution(arr,query));
    }

    private static int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int i=0; i<query.length; i++){
            if(query[i]%2 ==0) { // 짝수일때
                list.remove(query[i] +1);
            }
            else {
                list.remove((Integer) query[i] - 1);
            }
        }
        int [] arr2 = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr2[i] = list.get(i);
        }
        return arr2;
    }
}
