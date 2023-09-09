package DFSBFS;

public class factorial {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(solution(N));
    }

    private static int solution(int n) {
    return fac(n,1);
    n  += 2;
    System.out.println("하이");
    }

    private static int fac(int n, int sum) {
        if(n == 0){ // 조건이 무조건적으로 존재해야함 탈출조건.
            return sum;
        }
        return fac(n-1,sum * n);
    }
}
