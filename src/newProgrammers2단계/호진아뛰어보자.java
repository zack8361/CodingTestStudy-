package newProgrammers2단계;

public class 호진아뛰어보자 {
    private static int cnt;
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer= 0;
        dfs(0,n);

        return cnt;
    }

    private static void dfs(int sum, int n) {
        if(sum >= n){
            if(sum == n){
                cnt++;
            }
            return;
        }
        dfs(sum + 1, n);
        dfs(sum +2 ,n);
    }
}
