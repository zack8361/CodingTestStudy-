package newProgrammers2단계;

import java.util.Arrays;
import java.util.HashSet;

public class 연속부분수열합의개수dfs {
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};
        System.out.println(solution(elements));
    }

    private static int solution(int[] elements) {
        int[] newEl = new int[elements.length*2];

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < newEl.length; i++) {
            newEl[i] = elements[i%elements.length];
        }

        for (int i = 0; i < newEl.length; i++) {

        }


        return 0;
    }
}
