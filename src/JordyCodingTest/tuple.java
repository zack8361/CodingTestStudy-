package JordyCodingTest;

import java.lang.reflect.Array;
import java.util.*;

public class tuple {
    public static void main(String[] args) {
        String s ="{{20,111},{111}}";
        System.out.println(solution(s));

    }

    private static int[] solution(String s) {
        String num = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '{' && s.charAt(i) != '}'){
                num+=s.charAt(i);
            }
        }

//        int[] arr = new int[str.length];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = Integer.parseInt(str[i]);
//        }
//
        String[] str = num.split(",");
        HashMap<Integer,Integer> map = new HashMap<>();

//        for(int i=0; i<str.length; i++){
//            if(map.get(str[i]) == null){
//                map.put(str[i],1);
//            }
//            else {
//                map.put(str[i],map.get(str[i])+1);
//            }
//        }
//
//        int[] answer = new int[map.size()];
//        int index = 0;
//        for(String i: map.keySet()){
//            answer[index++] = map.get(i);
//        }
//        Integer[] answer2 = Arrays.stream(answer).boxed().toArray(Integer[]::new);
//        Arrays.sort(answer2, Collections.reverseOrder());
//        System.out.println(Arrays.toString(answer2));
//
//        int[] realAns = new int[answer.length];
//        for(int i=0; i<answer.length; i++){

//
//        }

        int[] answer = {};
        return answer;

    }
}
