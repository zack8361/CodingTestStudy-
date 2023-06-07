package newProgrammers2단계;

import java.util.Arrays;

public class 최댓값과최소값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }

    private static String solution(String s) {

        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] str = s.split(" ");

        for (int i = 0; i <str.length; i++) {
            max = Math.max(max, Integer.parseInt(str[i]));
            min = Math.min(min, Integer.parseInt(str[i]));
        }
        StringBuilder sb = new StringBuilder();

        sb.append(min).append(" ").append(max);

        return String.valueOf(sb);
    }
}
