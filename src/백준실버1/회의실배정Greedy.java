package 백준실버1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실배정Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        // 끝나는 시간을 기준으로 정렬하기.
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){             //종료 시간이 같다면 시작 시간이 빠른순으로 정렬.
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int prev_time = 0;
        for (int i = 0; i < time.length; i++) {
            if(prev_time <= time[i][0]){
                prev_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
