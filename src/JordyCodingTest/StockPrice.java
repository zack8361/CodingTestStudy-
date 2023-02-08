package JordyCodingTest;

import java.util.Stack;

/**
 * 스택/큐 -> 주식가격
 */
public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
        System.out.println(solution(prices));
    }

    private static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty()&&prices[stack.peek()]>prices[i]) { //더작은 값을 찾았으면?
                answer[stack.peek()] = i-stack.peek(); //현재 인덱스 - 피크인덱스 값 = 배열에 박힌다.
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            answer[stack.peek()] = prices.length-stack.peek()-1;
            stack.pop();
        }
        return answer;
    }
}
