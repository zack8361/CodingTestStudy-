package newProgrammers2단계;

import java.util.Arrays;

public class 최소값만들기 {
    public static void main(String[] args) {
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        System.out.println(solution(A,B));
    }

    private static int solution(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[b.length-i -1];
        }

        System.out.println(answer);
        return 0;
    }
}
