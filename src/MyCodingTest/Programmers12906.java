package MyCodingTest;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * 스택/큐
 * 같은 숫자는 싫어 (Lv.1)
 */
public class Programmers12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else {
                if(stack.peek()!=arr[i]){
                    stack.push(arr[i]);
                }
            }
        }
        System.out.println(stack);
        int[] answer = new int[stack.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
