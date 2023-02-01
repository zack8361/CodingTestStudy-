package MyCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Programmers42748 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(solution(array,commands));
    }

    private static int[] solution(int[] array, int[][] commands) {

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<commands.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            result.add(list.get((commands[i][2])-1));
        }
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
