package newProgrammers;

import java.util.Arrays;
import java.util.HashMap;

public class Tangerine {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1,3,2,5,4,5,2,3};
        System.out.println(solution(k,tangerine));
    }

    private static int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            if(map.get(tangerine[i]) == null){
                map.put(tangerine[i],1);
            }
            else {
                map.put(tangerine[i],map.get(tangerine[i])+1);
            }
            System.out.println(map.get(tangerine[i]));
        }
        int[] arr = new int[map.size()];
        int a = 0;
        for (int i: map.keySet()){
            arr[a++] = map.get(i);
        }

        int answer =0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1; i>=0; i--){
            k = k-arr[i];
            if(k<1){
                break;
            }
            answer++;
        }
        return answer;
    }
}
