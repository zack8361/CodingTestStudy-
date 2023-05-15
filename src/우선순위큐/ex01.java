package 우선순위큐;

import java.util.PriorityQueue;

public class ex01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min heap -> 오름차순 정렬.
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(12);
        pq.add(9);
        pq.add(13);
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());

    }
}
