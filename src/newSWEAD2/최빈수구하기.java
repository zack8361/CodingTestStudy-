package newSWEAD2;

import java.util.HashMap;
import java.util.Scanner;

public class 최빈수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int[] arr = new int[1000];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<arr.length; i++){
                if(map.get(arr[i]) == null){
                    map.put(arr[i],1);
                }
                else {
                    map.put(arr[i],map.get(arr[i]) + 1);
                }
            }
            int max = -1;
            int max2 = -1;
            for (int i : map.keySet()) {
                if(map.get(i)>max){
                    max = map.get(i);
                    max2 = i;
                }
            }
            System.out.println("#" + tc + " " + max2);
        }
    }
}
