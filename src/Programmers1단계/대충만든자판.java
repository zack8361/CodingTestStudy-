package Programmers1단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public static void main(String[] args) {
        String[] keymap = {"AGZ"};
        String[] targets = {"YGZ","BSSS"};
        System.out.println(solution(keymap,targets));
    }

    private static int[] solution(String[] keymap, String[] targets) {
        HashMap<Character,Integer> map = new HashMap<>();
        int[] arr2 = {-1};
        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                for(int z = 0; z<keymap.length; z++) {
                    for (int k = 0; k < keymap[z].length(); k++) {
                        if (targets[i].charAt(j) == keymap[z].charAt(k)) {
                            if (map.get(targets[i].charAt(j)) == null) {
                                map.put(targets[i].charAt(j), k + 1);
                            } else {
                                if (map.get(targets[i].charAt(j)) <= k + 1) {
                                    continue;
                                }
                                map.put(targets[i].charAt(j), k + 1);
                            }
                        }
                    }
                }
            }
        }
        int[] arr = new int[targets.length];

        for(int i=0; i<targets.length; i++){
            int count = 0;
            for(int j=0; j<targets[i].length(); j++){
                if(map.get(targets[i].charAt(j)) == null){
                    return arr2;
                }
                count += map.get(targets[i].charAt(j));
            }
            arr[i] = count;
        }
        
        return  arr;
    }
}
