package 주차4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 롤케이크자르기 {
    public static void main(String[] args) {
        int[] topping = {1,2,1,3,1,4,1,2};
        System.out.println(solution(topping));
    }

    private static int solution(int[] topping) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr1 = new int[topping.length];
        int[] arr2 = new int[topping.length];

        for (int i = 0; i < topping.length; i++) {
            set.add(topping[i]);
            arr1[i] = set.size();
        }
        set.clear();
        for (int i = topping.length-1; i >= 0; i--) {
            set.add(topping[i]);
            arr2[i] = set.size();
        }

        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            try {
                if(arr1[i] == arr2[i+1]){
                    answer++;
                }
            }
            catch (Exception e){

            }
        }
        System.out.println(answer);

        return 0;
    }
}
