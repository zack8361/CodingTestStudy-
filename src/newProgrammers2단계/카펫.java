package newProgrammers2단계;

import java.util.ArrayList;
import java.util.Arrays;

public class 카펫 {
    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;
        System.out.println(solution(brown,yellow));
    }

    private static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= sum ; i++) {
            if(sum%i == 0){
                list.add(i);
            }
        }
        int[] answer = new int[2];
        if(list.size() == 3){
            answer[0] = list.get(list.size()/2);
            answer[1] = list.get(list.size()/2);
        }
        else {
            answer[0] = list.get(list.size() / 2);
            answer[1] = list.get(list.size() / 2 - 1);
        }

        return answer;
        
    }
}
