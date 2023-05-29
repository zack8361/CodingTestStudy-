package Programmers2단계;

public class JadenCase문자열 {
    public static void main(String[] args) {
        String s = "3people unFollwed me";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String st = "";
            st += String.valueOf(s.charAt(i)).toLowerCase();
            ans += st;
        }
        String[] str = ans.split(" ");

        String answer = "";
        for (int i = 0; i < str.length; i++) {
            String st = String.valueOf(str[i].charAt(0));

        }

        return "123";
    }
}
