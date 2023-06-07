package newProgrammers2단계;

public class 숫자의표현 {
    private static int cnt;
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            int ans = i;
            for (int j = i+1; j <=n; j++) {
                ans+=j;
                if(ans>n){
                    break;
                }
                if(ans ==n){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

}
