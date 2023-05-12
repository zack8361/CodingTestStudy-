package 고득점kit해시;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(solution(genres,plays));
    }

    private static int[] solution(String[] genres, int[] plays) {

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<plays.length; i++){
            if(map.get(genres[i]) == null ){
                map.put(genres[i],plays[i]);
            }
            else {
                map.put(genres[i],map.get(genres[i]) + plays[i]);
            }
        }
        HashMap<Integer,String> map2 = new HashMap<>();
        for(int i=0; i<plays.length; i++){
            map2.put(plays[i],genres[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(String i: map.keySet()){
            int[] arr = new int[map2.size()];
            int a = 0;
            for(int j:map2.keySet()){
                if(map2.get(j).equals(i)){
                    arr[a++] = j;
                }
            }
            Arrays.sort(arr);

            list.add(arr[arr.length-1]);
            list.add(arr[arr.length-2]);
        }
        HashMap<Integer,Integer> map3 = new HashMap<>();
        for(int i=0; i<plays.length; i++){
            map3.put(plays[i],i);
        }

        int[] answer = new int[map.size()*2];
        for(int i=0; i<answer.length; i++){
           answer[i] = map3.get(list.get(i));
        }

        return answer;
    }
}
