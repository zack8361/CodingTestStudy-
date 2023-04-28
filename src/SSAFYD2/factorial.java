package SSAFYD2;

public class factorial {
    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum = 1;
        int m = 1;
        return fac(m,n,sum);
    }

    private static int fac(int m, int n, int sum) {
        if(n == 1) {
            return 1;
        }
        if(sum == n){
            return m-1;
        }
        else if(sum>=n){
            return m-2;
        }
        else {
           return fac(m+1, n, sum*m);
        }
    }
}
