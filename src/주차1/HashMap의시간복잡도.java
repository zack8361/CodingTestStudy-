package 주차1;

import java.util.HashMap;

public class HashMap의시간복잡도 {

    private static final int MAX = 100_000;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<MAX; i++){
            map.put(i,i);
        }
        int x = 0;

        for(int i=0; i<MAX; i++){
            if(map.containsKey(i)){
                x++;
            }
        }

        long end = System.currentTimeMillis();
        System.out.printf("%.6f초\n",(end-start)/1000.0);
    }
}
