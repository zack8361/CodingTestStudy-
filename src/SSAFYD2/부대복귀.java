package SSAFYD2;

public class 부대복귀 {
    public static void main(String[] args) {
        int n = 5;
        int[][] roads = {{1,2},{1,4},{2,4},{2,5},{4,5}};
        int[] sources = {1,3,5};
        int destination = 5;
        System.out.println(solution(n,roads,sources,destination));
    }

    private static int[] solution(int n, int[][] roads, int[] sources, int destination) {

        int N = roads.length;
        int M = roads[0].length;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(roads[i][j] + " ");
            }
            System.out.println();
        }

        return new int[0];
    }
}
