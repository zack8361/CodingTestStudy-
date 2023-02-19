package poscoXcodingon;

import java.util.Arrays;

public class plusNumSeperate {
    public static void main(String[] args) {
        int N = 123;
        System.out.println(solution(N));
    }

    private static int solution(int n) {

        int answer = 0;
        String[] str = String.valueOf(n).split("");
        for(int i=0; i<str.length; i++){
            answer+=Integer.parseInt(str[i]);
        }

        return answer;
    }
}
