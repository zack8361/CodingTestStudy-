package JordyCodingTest;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        System.out.println(soltuion(clothes));
    }

    private static int soltuion(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            if(map.get(clothes[i][1]) == null){
                map.put(clothes[i][1],1);
            }
            else {
                map.put(clothes[i][1],map.get(clothes[i][1]) + 1);
            }
        }
        //전체 경우의 수 = 각자 map 에 담겨있는 종류의 수 +1 * 다른 종류의 수;
        for(String key: map.keySet()){
            answer *= (map.get(key)+1);
        }
        answer--;
        return answer;
    }
}
