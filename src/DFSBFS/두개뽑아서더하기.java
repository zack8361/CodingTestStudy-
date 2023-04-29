package DFSBFS;


import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    private static ArrayList<Integer> list;
    private static boolean[] visited;
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] numbers) {
        list = new ArrayList<>();
        int[] map = new int[numbers.length];
        visited = new boolean[numbers.length];
        dfs(map,0);
        return new int[3];
    }

    private static void dfs(int[] map, int depth) {
        if (depth == map.length){
            System.out.println(Arrays.toString(map));
        }
        for(int i=0; i<2; i++){
            
        }
    }
}
