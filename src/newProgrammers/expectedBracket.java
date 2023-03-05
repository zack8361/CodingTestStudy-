package newProgrammers;

public class expectedBracket {
    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7;
        System.out.println(solution(N,A,B));
    }

    private static int solution(int n, int a, int b) {

        int answer = 0;
        while (true){
            a = (a/2) + (a%2);
            b = (b/2) + (b%2);
            answer++;
            if(a == b){
                break;
            }
        }

        return  answer ;
    }
}
