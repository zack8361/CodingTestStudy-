package Programmers0단계;

import java.util.ArrayList;
import java.util.HashMap;

public class 평행 {
    public static void main(String[] args) {
        int[][] dots = {{3,5},{4,1},{2,4},{5,10}};
        System.out.println(solution(dots));
    }

    private static int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        double result = 0;
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i<dots.length-1; i++){
            x = dots[i][0];
            y = dots[i][1];
            int x1 = 0;
            int y1 = 0;
            for(int j=i+1; j<dots.length; j++){
                x1 = dots[j][0];
                y1 = dots[j][1];
                result = (double) (y1-y) / (x1-x);
                list.add(result);
            }
        }
        HashMap<Double,Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++){
            if(map.get(list.get(i)) == null){
                map.put(list.get(i),1);
            }
            else {
                map.put(list.get(i),map.get(list.get(i))+1);
            }
        }
        for(double i:map.keySet()){
            if(map.get(i) >1){
                return 1;
            }
        }


        return 0;
    }
}
