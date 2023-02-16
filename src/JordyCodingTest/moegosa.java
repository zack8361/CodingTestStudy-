package JordyCodingTest;

public class moegosa {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        System.out.println(solution(answers));
    }

    private static int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] second = {2,1,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] answer = new int[0];

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i]){
                count1++;
            }
            if(answers[i] == second[i]){
                count2++;
            }
            if(answers[i] == second[i]){
                count3++;
            }
        }
        if(count1>count2 && count1>count3){
             answer = new int[]{1};
        }
        if(count1>count2 && count2 == count3){
            answer = new int[]{1};
        }
        if(count1>count3 && count2> count3 && count1 == count2){
            answer = new int[]{1,2};
        }
        if(count1 == count2 && count2 ==count3){
            answer = new int[]{1,2,3};
        }
        if(count2>count1 && count2 > count3){
            answer = new int[]{2};
        }
        return answer;
    }
}
