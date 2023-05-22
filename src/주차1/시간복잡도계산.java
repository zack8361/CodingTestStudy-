package 주차1;

import java.util.Arrays;

public class 시간복잡도계산 {
    
    private static final int MAX = 100_000;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int[] arr = new int[MAX+1];

        // O(N * NlognN)
        for (int i = 0; i < MAX; i++) {
            arr[i] = i+1;
            // 최악의 케이스 = N^2 -> 인위적으로 만든 케이스에서만
            // 랜덤 값 -> O(NlogN)
            Arrays.sort(arr); // O(NlogN)
        }
        long end = System.currentTimeMillis();
        System.out.printf("%.6f초\n",(end-start)/1000.0);
    }
}
