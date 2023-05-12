package 고득점kit해시;

import java.util.HashMap;

public class ex1폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length/2;

        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i] , 1 );
            }
            else {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        if(map.size()>=len){
            return len;
        }


        return map.size();
    }
}
