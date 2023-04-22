package Programmers1단계;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        int[] section = {1,2,3,4};
        System.out.println(solution(n,m,section));
    }

    private static int solution(int n, int m, int[] section) {
        int first = section[0];
        int end = section[section.length-1];
        int total = end-first+1;

        if(total<=m){
            return 1;
        }
        else {
            if(total%m != 0){
                return total/m + 1;
            }
            return  total/m;
        }

    }
}
