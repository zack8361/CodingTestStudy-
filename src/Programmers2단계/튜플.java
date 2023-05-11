package Programmers2단계;

import java.util.*;

public class 튜플 {
    public static void main(String[] args) {
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(solution(s));
    }

    private static int[] solution(String s) {

        String[] str = s.split("\\},\\{");
        System.out.println(Arrays.toString(str));

        String answer = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == ','){
                continue;
            }
            answer+=s.charAt(i);
        }

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<answer.length(); i++){
            if(map.get(String.valueOf(answer.charAt(i))) == null){
                map.put(String.valueOf(answer.charAt(i)),1);
            }
            else {
                map.put(String.valueOf(answer.charAt(i)),map.get(String.valueOf(answer.charAt(i)))+1);
            }
        }

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys,(v1,v2) -> (map.get(v2).compareTo(map.get(v1))));
        int[] result = new int[map.size()];
        int a = 0;
        for(String i: keys){
            result[a++] = Integer.parseInt(i);
        }

        return result;
    }
}
