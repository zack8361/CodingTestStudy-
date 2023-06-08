package newProgrammers1단계;

import java.util.Arrays;

public class 하샤드수 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] str = s.split("");

        Arrays.sort(str);

        String ans = "";
        for (int i = str.length-1; i >= 0 ; i--) {
            ans+=str[i];
        }

        return ans;
    }
}
