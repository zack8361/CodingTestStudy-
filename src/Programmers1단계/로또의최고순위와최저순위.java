package Programmers1단계;

import java.util.Arrays;
import java.util.HashMap;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos = {0,0,0,0,0,0};
        int[] win_nums = {31,10,45,1,6,19};
        System.out.println(solution(lottos,win_nums));
    }

    private static int[] solution(int[] lottos, int[] win_nums) {
        HashMap<Integer,Integer> answer = new HashMap<>();
        int a = 6;
        for(int i=1; i<=6; i++){
            answer.put(i,a);
            a--;
        }
        System.out.println(answer);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<win_nums.length; i++){
            map.put(win_nums[i],1);
        }

        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(map.containsKey(lottos[i])){
                cnt++;
            }
            if(lottos[i] == 0){
                cnt2++;
            }
        }
        int[] result = new int[2];



        int answer1 = cnt;
        int answer2 = cnt2 + cnt;
        
        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);

        for (int i : answer.keySet()) {
            if(answer1 == 0){
                result[1] = 6;
            }
            if(answer.get(i) == answer1){
                result[1] = i;
            }

        }

        for (int i : answer.keySet()) {
            if(answer2 == 0){
                result[0] = 6;
            }
            if(answer.get(i) == answer2){
                result[0] = i;
            }
        }



        return result;
    }
}
