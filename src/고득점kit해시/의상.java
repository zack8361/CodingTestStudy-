package 고득점kit해시;

import java.util.HashMap;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            if(map.get(clothes[i][1]) == null){
                map.put(clothes[i][1] , 1);
            }
            else {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
        }

        int answer = 1;
        for(String i: map.keySet()){
            answer *= map.get(i) + 1;
        }
        answer--;

        return answer;
    }
}
