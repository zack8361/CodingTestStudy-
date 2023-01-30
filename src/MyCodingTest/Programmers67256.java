package MyCodingTest;

import java.util.Stack;

/**
 * 2020 카카오 인턴십
 * 키패드 누르기 (Lv.1)
 */
public class Programmers67256 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }

    private static String solution(int[] numbers, String hand) {

        String answer = "";
        int right = 12;
        int left = 10;
        for(int i=0; i<numbers.length; i++){
            int n = numbers[i];
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer+="L";
                left = n;
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] ==9){
                answer+="R";
                right = n;
            }
            else{
                if(n==0){
                    n+=11;
                }
                int leftIndex = Math.abs((n-left)/3) + Math.abs((n-left)%3);
                int rightIndex = Math.abs((n-right)/3 + Math.abs(n-right)%3);
                if(leftIndex>rightIndex){
                    answer+="R";
                    right = n;
                }
                else if(leftIndex<rightIndex){
                    answer+="L";
                    left = n;
                }
                else {
                    if(hand.equals("right")){
                        answer+="R";
                        right = n;
                    }
                    else {
                        answer+="L";
                        left = n;
                    }
                }
            }
        }

        return answer;
    }
}
