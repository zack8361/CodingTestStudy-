package JordyCodingTest;

public class longJump {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int[] arr = new int[n+1];
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        //3,4

        int answer = 0;
        for(int i=3; i<=n; i++){
            arr[i] = (arr[i-1] + arr[i-2])%1234567;
            answer = arr[i];
        }

        return answer;
    }
}
