//package JordyCodingTest;
//
//import java.io.BufferedReader;
//import java.lang.reflect.Array;
//import java.util.*;
//
//public class tuple {
//    public static void main(String[] args) {
//        String s ="{{20,111},{111}}";
//        System.out.println(solution(s));
//
//    }
//
//    private static int[] solution(String s) {
//        String num = "";
//
//        for(int i=0; i<s.length(); i++) {
//            if (s.charAt(i) != '{' && s.charAt(i) != '}') {
//                num += s.charAt(i);
//            }
//        }
//        String[] str = num.split(",");
//        HashMap<String,Integer> map = new HashMap<>();
//        for(int i=0; i<str.length; i++){
//            if(map.get(str[i]) == null){
//                map.put(str[i],1);
////            }
////            else {
////                map.put(str[])
//            }
//        }
//
//        int[] answer = {};
//        return answer;
//
//    }
//}
