package newProgrammers1단계;

public class 문자열나누기 {
    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        // 답 개수
        int answer = 0;
        char ans = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if(count == 0) {
                answer++;
                ans = s.charAt(i);
            }

            if(ans == s.charAt(i)){
                count++;
            }
            else {
                count--;
            }
        }

        return answer + 1;
    }
}
