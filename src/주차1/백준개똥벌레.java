package 주차1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 백준개똥벌레 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // y 축
        int H = sc.nextInt(); // x축
        int[] bottom = new int[H]; // 석순
        int[] top = new int[H]; // 종유석

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            if(i%2 == 0){
                bottom[a-1]++;
            }
            else {
                top[a-1]++;
            }
        }
        for(int i=H-1; i>0; i--){
            top[i-1] = top[i] + top[i-1];
            bottom[i-1] = bottom[i] + bottom[i-1];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<H; i++){
            int ans = top[i] + bottom[bottom.length-i-1];
            if(map.get(ans) == null){
                map.put(ans,1);
            }
            else {
                map.put(ans,map.get(ans) +1);
            }
        }
        int min = Integer.MAX_VALUE;
        int minCnt = 0;
        for (int i : map.keySet()) {
            if(i<min){
                min = i;
                minCnt = map.get(i);
            }
        }
        System.out.println(min + " " + minCnt);
    }
}
