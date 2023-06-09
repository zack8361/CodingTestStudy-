package 백준실버3;

public class 삼총사 {
    private static int cnt;
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number));
    }

    private static int solution(int[] number) {
        dfs(number,0,0 , 0);


        return cnt;
    }

    private static void dfs(int[] number, int now, int sum , int depth) {
        if(depth == 3){
            if(sum == 0){
                cnt++;
            }
            return;
        }

        for (int i = now; i < number.length; i++) {
            dfs(number,i+1,sum + number[i] , depth+1);
        }
    }
}
