package Programmers1단계;

import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning ={5, 10, 1, 3};
        String[][] photo ={{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
        System.out.println(solution(name,yearning,photo));
    }

    private static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            if(map.get(name[i]) == null){
                map.put(name[i],yearning[i]);
            }
        }
        int[] arr = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                if(!map.containsKey(photo[i][j])){
                    continue;
                }
                sum += map.get(photo[i][j]);
            }
            arr[i] = sum;
        }
        return arr;
    }
}
