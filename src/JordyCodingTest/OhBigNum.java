package JordyCodingTest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 오큰수.(Baekjoon Gold.5)
 */
public class OhBigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    stack.push(arr[j]);
                    break;
                }
                
            }
        }
        stack.push(-1);
        System.out.println(stack);
    }
}
