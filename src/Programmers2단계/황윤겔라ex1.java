package Programmers2단계;

// 재귀함수 : parameter 값 두개, 1. 횟수, 2. 그 외 (sum, count)
public class 황윤겔라ex1 {
    public static void main(String[] args) {
        int m = 5;


        int sum = 1;
        System.out.println(factorial(m,sum));
    }

    private static int factorial(int m,  int sum) {

        if(m == 0){ // 여기가 탈출 조건.
            return sum;
        }
        else { // 아니면 다 타라.
            return factorial(m-1,sum*m);
        }
    }

}
