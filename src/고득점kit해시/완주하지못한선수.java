package 고득점kit해시;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant,completion));
    }

    private static String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<participant.length; i++){
            if(map.get(participant[i]) == null){
                map.put(participant[i],1);
            }
            else {
                map.put(participant[i],map.get(participant[i])+1);
            }
        }
        for(int i=0; i<completion.length; i++) {
            if (map.containsKey(completion[i])) {
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        for(String i: map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return "0";
    }
}
