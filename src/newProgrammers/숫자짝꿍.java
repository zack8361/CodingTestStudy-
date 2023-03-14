package newProgrammers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        String X = "5525";
        String Y = "1255";
        System.out.println(solution(X,Y));
    }

    private static String solution(String x, String y) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<y.length(); i++){
            list.add(y.charAt(i));
        }
        ArrayList<Character> list1 = new ArrayList<>();
        System.out.println(list);
        for(int i=0; i<x.length(); i++){
            if(list.contains(x.charAt(i))){
                list1.add(x.charAt(i));
                list.remove((Character) x.charAt(i));
            }
        }
        if(list1.size() == 0) {
            return "-1";
        }

        int[] arr = new int[list1.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(String.valueOf(list1.get(i)));
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        if(String.valueOf(sb).startsWith("0")){
            return "0";
        }

        return  String.valueOf(sb.reverse());
    }
}
