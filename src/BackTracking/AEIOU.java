//package BackTracking;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class AEIOU {
//    private static int cnt = 0;
//
//    private static ArrayList<String> list;
//    public static void main(String[] args) {
//        String word = "AAAE";
//        System.out.println(solution(word));
//    }
//
//    private static int solution(String word) {
//        String[] alp = {"A","E","I","O","U"};
//        dfs(alp,word,"");
//        list = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//
//        }
//
//    }
//
//    private static void dfs(String[] alp, String word, String s) {
//        list.add(s);
//        if(s.length() == alp.length){
//            return;
//        }
//        for (int i = 0; i < alp.length; i++) {
//            dfs(alp,word,s + alp[i]);
//        }
//    }
//}
