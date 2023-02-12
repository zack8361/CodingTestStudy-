package JordyCodingTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class carpet {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        System.out.println(solution(brown,yellow));
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow; //두개의 합
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=total; i++){
            if(total%i == 0){
                list.add(i);
            }
        }

        //짝수 일때.
        if(list.size() %2 ==0){
            answer[0] = list.get(list.size()/2);
            answer[1] = list.get(list.size()/2-1);
        }
        else {
            answer[0] = list.get(list.size()/2);
            answer[1] = list.get(list.size()/2);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
