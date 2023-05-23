package 싸피시험;

import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // tc 개수

        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int max = -1;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                max = Math.max(max, a);
                map.put(a,b);
            }

            System.out.println(map);
            int[] arr = new int[max];
            for (int i : map.keySet()) {
                arr[i-1] = map.get(i);
            }
            System.out.println(Arrays.toString(arr));
            int count = 0;

            for(int i=0; i<arr.length; i++){
                int misayle = arr[i];
                if(arr[i] != 0) {
                    count++;
                    try {
                        for (int j = 0; j <= misayle; j++) {
                            arr[i + j] = 0;
                        }
                    }
                    catch (Exception e){
                    }
                }
            }

            System.out.println(count);
            System.out.println(Arrays.toString(arr));
        }
    }
}
