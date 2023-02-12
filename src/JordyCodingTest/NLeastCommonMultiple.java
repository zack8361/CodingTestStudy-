package JordyCodingTest;

import java.util.ArrayDeque;
import java.util.Stack;

public class NLeastCommonMultiple {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int answer = 0;
        if(arr.length == 1){
            return arr[0];
        }
        int a = gcd(arr[0],arr[1]);
        answer = (arr[0] * arr[1])/ a;

        if(arr.length>2){
            for(int i=2; i<arr.length; i++){
                a = gcd(answer,arr[i]);
                answer = (answer*arr[i])/a;
            }
        }
        return answer;
    }

    private static int gcd(int a, int b) {
        if(a%b == 0){
            return b;
        }
        else {
            return gcd(b,a%b);
        }
    }
}
