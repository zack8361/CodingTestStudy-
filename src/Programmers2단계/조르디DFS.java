package Programmers2단계;

public class 조르디DFS {
    private static int[][] computer;
    private  static boolean[]visited;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n,computers));
    }

    private static int solution(int n, int[][] computers) {
        computer = computers; // 데이터 같이 복사.
        visited = new boolean[n];
        int answer = 0;
         for(int i=0; i<n; i++){
             if(!visited[i]){
                 dfs(i);
                 answer++;
             }
         }
         return answer;
    }
    private static void dfs(int now){
        if(visited[now]){
            return;
        }
        visited[now] = true; // 방문처리 해준다.
        for(int i=0; i<computer.length; i++){
            if(computer[now][i] == 1){
                dfs(i);
            }
        }
    }
}
