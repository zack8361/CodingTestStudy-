package Programmers2단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 연속부분수열합의개수 {
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};
        System.out.println(solution(elements));
    }

    private static int solution(int[] elements) {
        int[] newEl = new int[elements.length*2];
        for(int i=0; i<newEl.length; i++){
            newEl[i] = elements[i%elements.length];
        }
        int a = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (true) {
            a++;
            for (int i = 0; i < newEl.length - a + 1; i++) {
                int sum = 0;
                for (int j = 0; j < a; j++) {
                    sum+=newEl[i+j];
                    if(j==elements.length-1){
                        break;
                    }
                }
                map.put(sum,1);
            }
            if(a == newEl.length){
                break;
            }
        }

        return map.size();
    }
}
