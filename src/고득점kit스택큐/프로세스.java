package 고득점kit스택큐;

import java.util.HashMap;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int answer =priorities[location];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< priorities.length; i++){
            if(map.get(priorities[i]) == null){
                map.put(priorities[i],1);
            }
            else {
                map.put(priorities[i],map.get(priorities[i])+1);
            }
        }
        return map.get(answer);
    }
}
