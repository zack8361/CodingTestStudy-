package JordyCodingTest;

import java.util.Arrays;

public class plus {
    public static void main(String[] args) {
        int numer1 =1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        System.out.println(solution(numer1,denom1,numer2,denom2));
    }

    private static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numeric1 = denom2*numer1;
        int numeric2 = denom1 * numer2;
        int total = numeric2 + numeric1;

        int denomPar = denom1*denom2;
        int realTotal = total/gcd(total,denomPar);
        int realDenom = denomPar/gcd(total,denomPar);

        int[] answer = new int[2];
        answer[0] = realTotal;
        answer[1] = realDenom;
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    private static int gcd(int total, int denomPar) {
        if(denomPar == 0){
            return total;
        }
        else {
            return gcd(denomPar,total%denomPar);
        }

    }
}

//
//    let numer1 = 1;
//    let denom1 = 2;
//    let numer2 = 3;
//    let denom2 = 4;
//    function solution(numer1, denom1, numer2, denom2) {
//        let answer = [];
//        let GCD = 0;
//        let numer = (denom1 * numer2) + (numer1 * denom2);
//        let denom = denom1 * denom2;
//        for(let i = 1; i <= Math.min(numer,denom); i++){
//            if(numer % i === 0 && denom % i === 0){
//                GCD = i;
//            }
//        }
//        console.log(GCD);
//        return answer;
//    }
