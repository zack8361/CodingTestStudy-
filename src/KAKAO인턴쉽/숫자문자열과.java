package KAKAO인턴쉽;

import java.util.Arrays;
import java.util.HashMap;

public class 숫자문자열과 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        String[] alp = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        HashMap<String ,Integer> map = new HashMap<>();
        HashMap<String ,String > map2 = new HashMap<>();
        for (int i = 0; i < alp.length; i++) {
            map.put(alp[i],num[i]);
            map2.put(String.valueOf(num[i]),alp[i]);
        }

        String answer = "";
        String st = "";

        for (int i = 0; i < s.length(); i++) {
            if(map2.containsKey(String.valueOf(s.charAt(i)))){
                answer+=s.charAt(i);
                continue;
            }
            else{
                st+=s.charAt(i);
            }
            if(map.containsKey(st)){
                answer+=map.get(st);
                st = "";
            }
        }

        return Integer.parseInt(answer);
    }
}
