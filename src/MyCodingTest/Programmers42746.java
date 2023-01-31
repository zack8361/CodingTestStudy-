package MyCodingTest;

import java.util.Arrays;

/**
 * 정렬
 * 가장 큰 수 (Lv.2)
 */
public class Programmers42746 {
    public static void main(String[] args) {
        int[] numbers ={6,10,2};
        System.out.println(solution(numbers));
    }

    private static String solution(int[] numbers) {

        String[] arr = new String[numbers.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        if(arr[0].equals("0") && arr[1].equals("0")){
            return "0";
        }
        Arrays.sort(arr,(o1, o2) -> (o2+o1).compareTo(o1+o2));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return String.valueOf(sb);
    }
}
