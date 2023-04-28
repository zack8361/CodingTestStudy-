package SSAFYD2;

public class 바이러스 {
    private static boolean[] visited;
    public static void main(String[] args) {
        int n = 3;
        int[][]computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n,computers));
    }

    private static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i=0; i<computers.length; i++){
            if(!visited[i]){
                bfs(i,computers);
                answer++;
            }
        }
        return answer;

    }

    private static void bfs(int now,int[][] computers) {
        if(visited[now]){
            return;
        }
        else{
            visited[now] = true;
            for(int i=0; i<computers.length; i++) {
                if (computers[now][i] == 1) {
                    bfs(i, computers);
                }
            }
        }
    }
}
