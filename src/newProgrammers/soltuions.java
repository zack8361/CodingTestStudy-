package newProgrammers;

import java.util.*;

public class soltuions {
    public static void main(String[] args) {
        int k = 3;
        int[] user = {4,2,2,5,3};
        System.out.println(solution(k,user));
    }

    private static int[] solution(int k, int[] user) {
        int[] arr = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(i+1,user[i]);
        }
        for(int i=k; i<user.length; i++){
            map.put(i+1,user[i]);
        }
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));

        System.out.println(keySetList);
        return arr;
    }
}
