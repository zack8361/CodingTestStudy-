package Programmers2단계;

public class 땅따먹기 {
    private static int max = 0;
    private static boolean[] visited;
    private static boolean[] index;
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }

    private static int solution(int[][] land) {

        index = new boolean[land[0].length] ;
        dfs(land,0,0);
        return max;
    }

    private static void dfs(int[][] land,int depth,int sum) {

        if(depth == land.length){
            max = Math.max(max,sum);
            return;
        }

        for (int i = 0; i < land[0].length; i++) {
            if(!index[i]) {
                index[i] = true;
                dfs(land, depth + 1, sum + land[depth][i]);
                index[i] = false;
            }
        }

    }
}
