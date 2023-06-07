package 백준실버1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class 숨바꼭질 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(A);

        int count = 0;
        while (!deque.isEmpty()){
            int now = deque.pollFirst();

            // 선택할수 있는 배열 생성.
            int[] moves = {now + 1, now * 2, now - 1};

            for (int i = 0; i < 3; i++) {
            }
        }

    }
}
