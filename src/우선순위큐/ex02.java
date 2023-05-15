package 우선순위큐;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class ex02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // minHeap
        PriorityQueue<Integer> pq2= new PriorityQueue<>(Collections.reverseOrder()); // maxHeap
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(10);
        pq.add(4);
        pq.add(5);
        // 이터레이션 for 문 돌리면안된다. -> pq.poll() 로하면된다.
        while (!pq.isEmpty()){
            System.out.println("pq.poll() = " + pq.poll());
        }
        pq2.add(1);
        pq2.add(100);
        pq2.add(3);
        pq2.add(4);

        while (!pq2.isEmpty()){
            System.out.println("pq2 = " + pq2.poll());
        }
    }
}
