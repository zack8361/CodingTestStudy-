package 싸피시험;

import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // tc 개수

        for(int tc=1; tc<=T; tc++){
            List<Integer> position = new ArrayList<>();
            List<Integer> strong = new ArrayList<>();
            int N = sc.nextInt();
            for(int i=0; i<N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                position.add(a);
                strong.add(b);
            }
            int [] arr = new int[position.get(position.size()-1)+1];

            for(int i=0; i< position.size(); i++) {
                arr[position.get(i)] = strong.get(i);
            }
            int result = calc(arr,position,strong);
            System.out.println("#" + tc + " "+ result);

        }

    }
    public static int calc(int [] arr, List<Integer> position, List<Integer> strong) {
        int count =0;
        while(!isComplete(arr)) {
            int nowPosition = position.get(0);
            position.remove((Integer) nowPosition);
            int nowStrong = strong.get(0);
            strong.remove((Integer) nowStrong);
            count++;
            arr[nowPosition] = 0;
            try {
                for (int j = nowPosition+1; j <= nowPosition + nowStrong; j++) { // 현재 발사기가 박살났을 때 결과
                    if (arr[j] == 0) {
                        continue;
                    } else {
                        int nowPosition1 = position.get(0);
                        if(nowPosition1 == j) {
                            position.remove((Integer) nowPosition1);
                            int nowStrong1 = strong.get(0);
                            strong.remove((Integer) nowStrong1);
                        }
                        arr[j] = 0;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }

        return count;

    }

    public static boolean isComplete(int [] arr) {
        for(int i=0; i< arr.length; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
