package JordyCodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class trainingClothes {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n,lost,reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        /**
         * 잃어버린 새끼들 list에 담기
         */
        for (int i=0; i<lost.length; i++){
            list.add(lost[i]);
        }

        /**
         * 빌려줄 새끼들 list에 담기
         */
        for(int i=0; i<reserve.length; i++){
            list2.add(reserve[i]);
        }


        for(int i=0; i<lost.length; i++){
            if(list2.contains(lost[i]-1)){
                list2.remove((Integer) (lost[i]-1));
                list.remove((Integer) lost[i]);

            }
            else if(list2.contains(lost[i]+1)){
                list2.remove((Integer) (lost[i]+1));
                list.remove((Integer) lost[i]);

            }
        }
        return n-list.size();
    }
}
