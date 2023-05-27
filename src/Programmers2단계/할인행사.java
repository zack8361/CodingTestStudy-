package Programmers2단계;

import java.util.HashMap;

public class 할인행사 {

    public static void main(String[] args) {
        String[] want = {"banana","apple","rice","pork","pot"};
        int[] number = {3,2,2,2,1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want,number,discount));
    }

    private static int solution(String[] want, int[] number, String[] discount) {
        int N = discount.length-10;
        System.out.println(N);

        int answer = 0;

        for(int i=0; i<N; i++){
            HashMap<String ,Integer> map = new HashMap<>();
            for(int k=0; k<number.length; k++){
                for(int j=0; j<number[k]; j++){
                    try {
                        if (map.get(want[k]) == null) {
                            map.put(want[k], 1);
                        } else {
                            map.put(want[i], map.get(want[i]) + 1);
                        }
                    }
                    catch (Exception e){

                    }
                }
            }
            for(int j=i; j<10+i; j++){
                if(map.containsKey(discount[j]) && map.get(discount[j])>0){
                    map.put(discount[j],map.get(discount[j])-1);
                }
            }
            System.out.println(map);
        }
        return 0;
    }
}
