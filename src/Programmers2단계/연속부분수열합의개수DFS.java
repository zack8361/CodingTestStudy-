package Programmers2단계;

import javax.swing.text.Element;
import java.util.Arrays;
import java.util.HashMap;

public class 연속부분수열합의개수DFS {
    private static boolean[] visited;
    private static int sum;
    private static HashMap<Integer,Integer> map;
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};
        System.out.println(solution(elements));
    }

    private static int solution(int[] elements) {


        int a = 0;
        int[] newElements = new int[elements.length * 2];
        for(int i=0; i<newElements.length; i++){
            newElements[i] = elements[i];
        }

        System.out.println(Arrays.toString(newElements));

        HashMap<Integer,Integer> map = new HashMap<>();
        while(true) {
            a++;
            for (int i = 0; i < newElements.length - a + 1; i++) {
                int sum = 0;
                for (int j = 0; j < a; j++) {
                    sum += newElements[i + j];
                }
                System.out.print(sum + " ");
            }
            if(a == newElements.length){
                break;
            }
        }
        return 0;
    }
}
