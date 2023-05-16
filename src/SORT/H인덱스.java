package SORT;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Arrays;

public class H인덱스 {
    public static void main(String[] args) {
        int[] citations = {4,0,6,1,5};
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {

        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));

        return 0;
    }
}
