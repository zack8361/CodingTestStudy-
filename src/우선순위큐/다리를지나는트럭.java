package 우선순위큐;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayDeque;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }

    private static int solution(int bridgeLength, int weight, int[] truckWeights) {
        int answer = 0;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        if(bridgeLength>=truckWeights.length){
            return weight + truckWeights.length;
        }

        return answer;
    }
}
