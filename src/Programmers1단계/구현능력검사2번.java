package Programmers1단계;

public class 구현능력검사2번 {
    public static void main(String[] args) {
        int n = 3;
        int v = 101;
        int[] A = {1,2,3};
        int[] B = {4,5,6};
        int[] C = {10,11,12};
        solution(n,v,A,B,C);
    }

    private static int solution(int n, int v, int[] A, int[] B, int[] C) {

        int answer = 0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                for(int k= 0; k<C.length; k++){
                    answer = A[i] * B[j] * C[k];
                    System.out.println(answer);
                    if(answer>v){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
