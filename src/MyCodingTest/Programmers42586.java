package MyCodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers42586 {
    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        System.out.println(solution(progresses,speeds));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        for (int i=0; i<progresses.length; i++){
            answer[i] = 100-progresses[i];
        }
        int[] result = new int[speeds.length];
        for(int i=0; i<answer.length; i++){
            if(answer[i]%speeds[i] !=0){
                result[i] = answer[i]/speeds[i] + 1;
            }
            else if(answer[i]%speeds[i] == 0){
                result[i] = answer[i]/speeds[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = result[0];
        int count = 1;
        for(int i=1; i<result.length; i++){
            if(max<result[i]){
                max = result[i];
                list.add(count);
                count=1;
            }
            else {
                count++;
            }
        }
        list.add(count);
        
        return answer;
    }
}
