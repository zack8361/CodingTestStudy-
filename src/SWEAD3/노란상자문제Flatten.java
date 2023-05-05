package SWEAD3;

import java.util.Arrays;
import java.util.Scanner;

public class 노란상자문제Flatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        int N = 100;
        for (int tc = 0; tc < T; tc++) {
            int dump = sc.nextInt();
            int[] map = new int[N];

            for(int i=0; i<map.length; i++){
                map[i] = sc.nextInt();
            }
            for(int i=0; i<dump; i++){
                Arrays.sort(map);
                map[0]++;
                map[map.length-1]++;
            }
            Arrays.sort(map);
            System.out.println("#" + tc + " " + (map[99] - map[0]));
        }
    }
}
