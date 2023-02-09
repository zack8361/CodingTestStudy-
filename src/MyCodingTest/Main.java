package MyCodingTest;

import java.util.Arrays;
import java.util.Stack;

/**
 * String -> 2차원 Array 변경
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,3,3,5};
        System.out.println(soultion(numbers));
    }
    private static int[] soultion(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=numbers.length-1; i>=0; i--){
            while (!stack.isEmpty() && numbers[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                answer[i] = -1;
            }
            else {
                answer[i] = stack.peek();
            }
            stack.push(numbers[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}