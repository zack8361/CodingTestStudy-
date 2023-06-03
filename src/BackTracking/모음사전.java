package BackTracking;

import java.util.HashMap;

public class 모음사전 {
    private static int answer = 0;
    private static HashMap<String ,Integer> map;
    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }

    private static int solution(String word) {
        int result = 0;
        String[] alp = {"A","E","I","O","U"};
        map = new HashMap<>();
        dfs("",alp);

        for (int i = 0; i < map.size(); i++) {
            if(map.containsKey(word)){
                result = map.get(word);
            }
        }
        return result;
    }

    private static void dfs(String s, String[] alp) {
        map.put(s,answer);
        if(s.length() == alp.length){
            return;
        }
        for (int i = 0; i < alp.length; i++) {
            answer++;
            dfs(s+alp[i] , alp);
        }
    }
}
