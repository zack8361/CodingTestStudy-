package JordyCodingTest;

import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {
        Arrays.sort(citations);

        int answer = 0;
        for(int i=0; i<citations.length; i++){
            if(citations[i]>=citations.length-i){
                answer = citations.length-i;
                break;
            }
        }
        return answer;
    }
}
