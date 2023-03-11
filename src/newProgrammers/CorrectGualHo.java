package newProgrammers;

import java.util.Stack;

public class CorrectGualHo {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s));
    }


    private static boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                if(s.charAt(i) == ')'){
                    return false;
                }
                else {
                    stack.push(s.charAt(i));
                }
            }
            else {
                if(stack.peek() != s.charAt(i)){
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
