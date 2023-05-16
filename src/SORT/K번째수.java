package SORT;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(solution(array,commands));
    }

    private static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            int[] arr = new int[b-a+1];
            int z = 0;
            for(int j = a-1; j<=b-1; j++){
                arr[z++] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[c-1];
        }

        return answer;
    }
}
