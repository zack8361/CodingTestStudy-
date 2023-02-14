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

        //map (옷의 종류, 개수로 설정)
        Map<String,Integer> map = new HashMap<>();
        System.out.println(map);

        for(int i=0; i<clothes.length; i++){
            if(map.get(clothes[i][1]) == null){
                map.put(clothes[i][1],1);
            }
            else {
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            }
        }
        System.out.println(map);

        for(String s: map.keySet()){
            answer *= (map.get(s)+1);
        }

        answer--;

        return answer;
    }
}
