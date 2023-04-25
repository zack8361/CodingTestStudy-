package DFSBFS;

import java.util.ArrayList;

public class ex01 {
    private static final int[][] input = {{1,2},{2,3},{2,4},{5,2},{5,1},{5,4}};

    public static void main(String[] args) {
        int N = 5;
        ArrayList<Integer>[] adjList = new ArrayList[N+1];

        // 초기화.
        for(int i=0; i<N; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int []arr : input){
            adjList[arr[0]].add(arr[1]);
        }
        for(int next : adjList[5]){
            System.out.println("next = " + next);
        }

    }
}
