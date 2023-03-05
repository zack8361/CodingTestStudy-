package newProgrammers;

public class JumpAndIronMan {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(solution(N));
    }

    private static int solution(int n) {

        int answer = 1;

        if(n==1) {
            return 1;
        }
        while (true) {
            if(n%2 == 1){
                answer++;
            }
            n = n/2;

           if(n==1){
               break;
           }
        }

        return answer;
    }
}
