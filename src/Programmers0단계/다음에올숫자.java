package Programmers0단계;

public class 다음에올숫자 {
    public static void main(String[] args) {
        int[] common = {1,2,3,4};
        System.out.println(solution(common));
    }

    private static int solution(int[] common) {
        if((common[1] - common[0]) == (common[2]-common[1])){
            int ch = common[1]-common[0];
            return common[common.length-1] + ch;
        }
        int gob = common[1]/common[0];
        return common[common.length-1] * gob;
    }
}
