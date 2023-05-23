package 주차4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapEx01 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(solution(record));
    }

    private static String[] solution(String[] record){

        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i< record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter") || str[0].equals("Change")){
                map.put(str[1],str[2]);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){
                String ans = map.get(str[1]);
                list.add(ans+"님이 들어왔습니다.");
            }
            else if(str[0].equals("Leave")){
                String ans = map.get(str[1]);
                list.add(ans + "님이 나갔습니다.");
            }
            else {
                 continue;
            }
        }
        String[] answer = new String[list.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
