package newProgrammers2단계;

import java.util.Arrays;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        String s = "3people unFollowed me ";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
            String[] str2 = str[i].split("");
            String se = "";
            for (int j = 0; j < str2.length; j++) {
                str2[0] = str2[0].toUpperCase();
                se +=str2[j];
            }

            if(i == str.length-1){
                sb.append(se);
            }
            else {
                sb.append(se).append(" ");
            }
        }
        if(s.charAt(s.length() -1 ) == ' '){
            sb.append(" ");
        }

        return String.valueOf(sb);

    }
}
