package JordyCodingTest;

import java.util.Arrays;

public class carpetAnswer {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        System.out.println(solution(brown,yellow));
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        for(int i=1; i<=sum; i++){
            if(sum%i == 0 ){
                int j = sum/i;
                if(i>=yellow&&j>=yellow) {
                    if ((i - 2) * (j - 2) == yellow) {
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
