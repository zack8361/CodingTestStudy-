package 완전탐색;

import java.util.Arrays;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));
    }

    private static int solution(int[][] sizes) {

        int max = 0;
        int max2 = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                continue;
            }
            else {
                int size = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = size;
            }
        }
        
        for(int i=0; i<sizes.length; i++){
            max = Math.max(max,sizes[i][0]);
            max2 = Math.max(max2,sizes[i][1]);
        }
        return max * max2;
    }
}
