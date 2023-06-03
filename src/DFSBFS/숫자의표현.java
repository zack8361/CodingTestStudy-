package DFSBFS;

public class 숫자의표현 {

    public static int answer = 0;

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        for(int i=1; i<=n; i++){
            dfs(n,0);
        }
        return answer;
    }

    private static void dfs(int n, int sum) {
        if(sum == n){

            answer++;
        }
        else if(sum<n){
            dfs(n+1,sum+n);
        }
    }
}