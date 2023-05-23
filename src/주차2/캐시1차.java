package 주차2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 캐시1차 {
    public static void main(String[] args) {
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        System.out.println(solution(cacheSize,cities));
    }

    private static int solution(int cacheSize, String[] cities) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        int answer = 0;

        for(int i=0; i<cities.length; i++){
            cities[i] = cities[i].toUpperCase();
            if(deque.contains(cities[i])){
                deque.remove(cities[i]);
                deque.addLast(cities[i]);
                answer+=1;
            }
            else {
                deque.addLast(cities[i]);
                if(deque.size()>cacheSize){
                    deque.pollFirst();
                }
                answer+=5;
            }
        }

        return answer;
    }
}
