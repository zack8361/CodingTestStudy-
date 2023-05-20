package 백준실버2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 스택수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
            arr2[i] = sc.nextInt();
        }
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int a = 0;
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        deque.addLast(arr[0]);
        list.add("+");
        while (true){
            if (deque.isEmpty()){
                break;
            }
            if(deque.peekLast() == arr2[i]){
                list.add("-");
                i++;
                deque.pollLast();
            }
            else {
                a++;
                deque.addLast(arr[a]);
                list.add("+");
            }
        }
        if(list.size() == N*2){
            for(int ans=0; ans<list.size(); ans++){
                System.out.println(list.get(ans));
            }
        }
        else {
            System.out.println("NO");
        }
    }
}
