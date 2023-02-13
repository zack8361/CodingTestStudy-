package JordyCodingTest;

import java.util.ArrayDeque;
import java.util.Stack;

public class newId {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }

    private static String solution(String new_id) {
        //1단계(소문자로 변경)
        String lower = new_id.toLowerCase();
        System.out.println(lower);

        //2단계(소문자, -, _ , .) 제외 다삭제 시키기
        String container = "";
        for(int i=0; i<lower.length(); i++){
            if(lower.charAt(i)>=97 || lower.charAt(i) == '_' || lower.charAt(i) == '.'){
                container+=lower.charAt(i);
            }
        }

        //3단계 (.. -> . ) 로 바꾸기
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<container.length(); i++){
            if(stack.isEmpty()){
                stack.addLast(container.charAt(i));
            }
            else {
                if(stack.peekLast()=='.' && container.charAt(i) == '.'){
                    stack.pollLast();
                }
                stack.addLast(container.charAt(i));
            }
        }
        //4단계(마침표가 처음이나 끝에 위치하면 삭제시켜);
        if(stack.peekFirst() =='.'){
            stack.pollFirst();
        }
        if(stack.peekLast() =='.'){
            stack.pollLast();
        }

        //5단계(아이디가 빈 문자열일 경우 마지막에 a를 더해라)
        if(stack.size()==0){
            stack.addLast('a');
        }

        //6단계 ->아이디의 길이가 16자 이상이면 잘라.

        if(stack.size()>=16) {
            for (int i = 13; i <=stack.size(); i++){
                stack.pollLast();
            }
        }

        //7단계 아이디의 길이가 2자 이하이면 마지막 문자를 길이가 3이 될때까지 붙여라
        if(stack.size()<=2){
            while (stack.size()<4){
                stack.addLast(stack.peekLast());
            }
        }
        //String 으로 변환
        StringBuilder sb = new StringBuilder();
        int s = stack.size();

        for(int i=0; i<s; i++){
            sb.append(stack.pollFirst());
        }
        return String.valueOf(sb);
    }
}
