package Programmers1단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 숫자짝궁 {
    public static void main(String[] args) {
        String X = "5525";
        String Y = "1255";
        System.out.println(solution(X,Y));
    }

    private static String solution(String x, String y) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<x.length(); i++){
            if(map.get(x.charAt(i)) == null){
                map.put(x.charAt(i) ,1);
            }
            else {
                map.put(x.charAt(i), map.get(x.charAt(i)) + 1);
            }
        }

        String answer = "";
        for(int i=0; i<y.length(); i++){
            if(map.containsKey(y.charAt(i))){
                map.put(y.charAt(i),map.get(y.charAt(i))-1);
                answer+=y.charAt(i);
            }
            else {
                continue;
            }
        }

        if(answer.isEmpty()){
            return "-1";
        }

        String[] str = answer.split("");
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        String result = "";
        int count = 0;

        for(int i=str.length-1; i>=0; i--){
            result+=str[i];
            if(!str[i].equals("0")){
                count++;
            }
        }
        if(count == 0){
            return "0";
        }

        return result;
    }
}
