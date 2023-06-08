package newProgrammers1단계;

public class 시저암호 {
    public static void main(String[] args) {
        String s  ="AB";
        int n =1;
        System.out.println(solution(s,n));
    }

    private static String solution(String s, int n) {

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i + 1));
        }
        return null;
    }
}
