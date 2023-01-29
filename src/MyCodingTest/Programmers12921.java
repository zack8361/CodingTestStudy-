package MyCodingTest;

/**
 * 소수 찾기 (Lv.1)
 */
public class Programmers12921 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

    }

    private static int solution(int n) {

        int count = 0;
        int answer= 0;
        if(n>=2){
            answer=1;
        }
        for(int i=3; i<=n; i++){
            count=0;
            for(int j=2; j<i; j++){
                if(i%j != 0){
                    count++;
                }
            }
            if(count == 1){
                answer++;

            }
        }
        System.out.println(answer);
        return 0;
    }
}
