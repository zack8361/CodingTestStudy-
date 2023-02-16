package JordyCodingTest;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        int n = 10;
        System.out.println((solution(n)));
    }

    private static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%2 ==1){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
        }
}
