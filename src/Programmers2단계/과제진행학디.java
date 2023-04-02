package Programmers2단계;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;

public class 과제진행학디 {
    public static void main(String[] args) {
        String[][] plans = {{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}};
        System.out.println(solution(plans));
    }

    private static String[] solution(String[][] plans) {
        Arrays.sort(plans, Comparator.comparing(o1 -> (o1[1])));

        ArrayDeque<String> deque = new ArrayDeque<>();
        ArrayDeque<String> answerDeq = new ArrayDeque<>();
        for(int i=0; i<plans.length; i++) {
            String[] time = plans[i][1].split(":");
            time[1] = String.valueOf(Integer.parseInt(time[1]) + Integer.parseInt(plans[i][2]));
            if (Integer.parseInt(time[1]) >= 60) {
                time[0] = String.valueOf(Integer.parseInt(time[0]) + 1);
                time[1] = String.valueOf(Integer.parseInt(time[1]) % 60);
            }
            String realTime = time[0] + time[1];
            if(realTime.length()<4){
                realTime = realTime + "0";
            }
            System.out.println(realTime);
            if(deque.isEmpty()) {
                deque.push(realTime);
                answerDeq.push(plans[i][0]);
            }
            else {
                if(Integer.parseInt(deque.peek())<Integer.parseInt(realTime)){
                    deque.addFirst(realTime);
                    answerDeq.push(plans[i][0]);
                }
                else {
                    answerDeq.push(plans[i][0]);
                }
            }
        }
        System.out.println(answerDeq);
        String[] answer = new String[plans.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerDeq.getFirst();
            answerDeq.remove(answerDeq.getFirst());
        }
        return answer;
    }
}
