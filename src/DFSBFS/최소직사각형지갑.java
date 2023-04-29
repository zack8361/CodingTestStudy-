package DFSBFS;

import java.util.Arrays;

public class 최소직사각형지갑 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));
    }

    private static int solution(int[][] sizes) {
        int N = sizes.length;
        int M = sizes[0].length;
        int max = -1;
        int max2 = -1;
        for (int i = 0; i < N; i++) {
            if(sizes[i][0] > sizes[i][1]){
                continue;
            }
            else {
                int size = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = size;
            }
        }

        for (int i = 0; i < N; i++) {
            if (max<sizes[i][0]){
                max = sizes[i][0];
            }
            if(max2<sizes[i][1]){
                max2 = sizes[i][1];
            }
        }

        return max * max2;
    }
}
