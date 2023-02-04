package MyCodingTest;

/**
 * 멀쩡한 사각형(Programmers Lv.1)
 */
public class Programmers62048 {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;
        System.out.println(solution(w,h));
    }

    private static long solution(int w, int h) {
        long answer = 0;
        long result = gcd(w,h);
        answer = (w*h) - (w+h-result);
        return answer;
    }

    private static int gcd(int w, int h) {
        if(w%h ==0){
            return h;
        }
        else {
            return gcd(h, w%h);
        }
    }
}

