package JordyCodingTest;

import java.util.Arrays;
import java.util.Stack;

/**
 * Summer/Winter Coding(~2018)
 * 영어 끝말잇기
 */
public class englishLastWord {
    public static void main(String[] args) {

        int n = 5;
        String[] words = {"hello", "ebserve", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println(solution(n,words));
    }

    private static int[] solution(int n,String[] words) {
        int[] answer = new int[2];
        Stack<String> stack = new Stack<>();
        for(int i=0; i<words.length; i++){
            if(stack.isEmpty()){
                stack.push(words[i]);
            }
            else {
                if(stack.peek().charAt(stack.peek().length()-1) != words[i].charAt(0) || stack.contains(words[i])){
                    answer[0] = (i%n)+1;
                    answer[1] = (i/n) + 1;
                    break;
                }
            }
            stack.push(words[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
