package newProgrammers1단계;

import java.util.HashMap;
import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size() > nums.length/2){
            return nums.length;
        }

        System.out.println("set = " + set.size());
        System.out.println("nums = " + nums.length);
        return set.size();
    }
}
