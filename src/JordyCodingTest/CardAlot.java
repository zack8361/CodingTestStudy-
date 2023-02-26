package JordyCodingTest;

/**
 * 씨발 모르겠다 윤규야 도와줘
 */
public class CardAlot {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want","to"};
        String[] goal = {"i","want","to","drink","water"};
        System.out.println(solution(cards1,cards2,goal));

    }

    private static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int index1 = 0;
        int index2 = 0;

        for(int i=0; i<goal.length; i++){
            if(cards1.length>index1 &&goal[i].equals(cards1[index1])){
                index1++;
            }
            else if(cards2.length > index2 && goal[i].equals(cards2[index2])){
                index2++;
            }
            else {
                answer = "No";
                return answer;
            }
        }




        return answer;
    }
}