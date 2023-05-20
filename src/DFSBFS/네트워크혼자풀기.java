package DFSBFS;

public class 네트워크혼자풀기 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));
    }
    private static boolean[] visited;
    private static int count = 0;
    private static int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        for(int i=0; i<computers.length; i++){
            if(!visited[i]) {
                dfs(computers, i);
                count++;
            }
        }
        System.out.println("count = " + count);
        return count;
    }

    private static void dfs(int[][] computers, int start) {
        if(visited[start]){
            return;
        }
        visited[start] = true;
        for(int i=0; i<computers.length; i++){
            if(computers[start][i] == 1){
                dfs(computers,i);
            }
        }
    }
}