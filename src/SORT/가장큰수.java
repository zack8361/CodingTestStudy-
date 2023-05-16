package SORT;

import java.util.Arrays;

public class 가장큰수 {

    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));
    }

    private static String solution(int[] numbers) {

        String[] number = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            number[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(number,((o1, o2) -> (o2+o1).compareTo(o1+o2)));

        return "9";
    }
}
