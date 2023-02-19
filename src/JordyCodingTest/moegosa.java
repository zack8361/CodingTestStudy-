package JordyCodingTest;

import java.util.ArrayList;
import java.util.HashMap;

public class moegosa {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5]){
                count1++;
            }
            if(answers[i] == second[i%8]){
                count2++;
            }
            if(answers[i] == third[i%10]){
                count3++;
            }
        }
        int max = Math.max(count1,count2);
        int maxTot = Math.max(max,count3);

        ArrayList<Integer> list = new ArrayList<>();


        if(count1 == maxTot){
            list.add(1);
        }
        if(count2 == maxTot){
            list.add(2);
        }
        if(count3 == maxTot){
            list.add(3);
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}