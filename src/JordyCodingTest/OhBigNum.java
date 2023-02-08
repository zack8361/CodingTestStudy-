package JordyCodingTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수.(Baekjoon Gold.5)
 */

public class OhBigNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer = new int[N];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
         for(int i=N-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peekLast() <= arr[i]){
                stack.pollLast();
            }
            if(stack.isEmpty()){
                answer[i] = -1;
            }
            else {
                answer[i] = stack.peekLast();
            }
            stack.addLast(arr[i]);
        }
         StringBuilder sb = new StringBuilder();
         for(int i=0; i<answer.length; i++){
             sb.append(answer[i]).append(" ");
         }
        System.out.println(sb);
    }
}
