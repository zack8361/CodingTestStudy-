package Programmers1단계;

import java.util.ArrayList;
import java.util.HashMap;

public class 대충만든자판다시풀어보기 {
    public static void main(String[] args) {
        String[] keymap = {"BC"};
        String[] targets = {"AC","BC"};
        System.out.println(solution(keymap,targets));
    }

    private static int[]solution(String[] keymap, String[] targets) {

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++){
                if(map.get(keymap[i].charAt(j)) == null){
                    map.put(keymap[i].charAt(j) , j+1);
                }
                else {
                    if(map.get(keymap[i].charAt(j)) <= j+1){
                        continue;
                    }
                    else {
                        map.put(keymap[i].charAt(j),j+1);
                    }
                }
            }
        }
        System.out.println(map);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<targets.length; i++){
            int answer = 0;
            for(int j=0; j<targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j))){
                    answer+=map.get(targets[i].charAt(j));
                }
                else {
                    System.out.println(targets[i].charAt(j));
                    answer = -1;
                    break;
                }
            }
            list.add(answer);
        }
        System.out.println(list);
        int[] arr =new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
