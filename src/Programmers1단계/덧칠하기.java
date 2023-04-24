package Programmers1단계;

import java.util.ArrayList;
import java.util.List;

// 윤규 풀이
//
public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};
        System.out.println(solution(n,m,section));
    }

    private static int solution(int n, int m, int[] section) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<section.length; i++){
            list.add(section[i]);
        }
        int i=0;
        while (!list.isEmpty()){
            int temp = list.get(0);
            for(int j=0; j<m; j++){
                list.remove((Integer)(temp +  j));
            }
            i++;
        }
        return i;
    }
}
