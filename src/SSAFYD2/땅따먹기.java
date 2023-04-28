package SSAFYD2;

import java.util.Arrays;
import java.util.Comparator;

import static Programmers2단계.Solution.solution;

public class 땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }

    private static int solution(int[][] land) {
        int answer = 0;
        int idx = 5;
        for(int i=0; i<land.length; i++){
            int max = 0;
            for(int j=0; j<land[i].length; j++){
                if(max<land[i][j]){

                }
            }
            System.out.println(idx + "번 값 : " + max);
            answer +=max;
        }
        return answer;
    }
}
