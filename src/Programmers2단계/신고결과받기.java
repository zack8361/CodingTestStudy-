package Programmers2단계;

import java.util.Arrays;
import java.util.HashMap;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        System.out.println(solution(id_list,report,k));
    }

    private static int[] solution(String[] id_list, String[] report, int k) {

        HashMap<String,String> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            String[] str = report[i].split(" ");
            if(map.get(str[0])  == null){
                map.put(str[0],str[1]);
            }
            else {
                if(!map.get(str[0]).contains(str[1])) {
                    map.put(str[0], map.get(str[0]) + "," + str[1]);
                }
            }
        }

        // 횟수 집어넣기.
        for (String s : map.keySet()) {
            String st = map.get(s);
            String[] str = st.split(",");
            for(int i=0; i<str.length; i++){
                if(map2.get(str[i]) == null){
                    map2.put(str[i],1);
                }
                else {
                    map2.put(str[i],map2.get(str[i]) + 1);
                }
            }
        }


        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            int cnt = 0;
            try {
                String st = map.get(id_list[i]);
                String[] str = st.split(",");
                for (int j = 0; j < str.length; j++) {
                    if(map2.get(str[j]) >= k){
                        cnt++;
                    }
                }
            }
            catch (Exception e){

            }
            answer[i] = cnt;
        }

        return answer;
    }
}
