package SSAFYD2;

public class 피로도 {
    static int count = 0;
    static boolean[] visited;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k,dungeons));
    }

    private static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length]; // 배열 3개만 돌면 되니까.
        dfs(0,k,dungeons);
        return count;
    }

    private static void dfs(int depth, int k, int[][] dungeons) {
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0]<=k){
                visited[i] = true;
                dfs(depth+1,k-dungeons[i][1],dungeons);
                visited[i] = false;
                
            }
        }
        count = Math.max(count,depth);
    }
}
