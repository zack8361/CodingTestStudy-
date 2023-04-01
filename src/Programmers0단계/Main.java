package Programmers0단계;

public class Main {
    public static void main(String[] args) {
        int N = 17;
        System.out.println(solution(N));
    }

    private static int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 1;
        for(int i=2; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[arr.length-1];
    }
}
