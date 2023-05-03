package SWEAD2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class 조교의성적매기기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // testcase 횟수
        for(int t = 1; t<=N; t++){ // 횟수만큼 for 문
            int A = sc.nextInt(); //몇명의 학생인지
            int pick = sc.nextInt(); // 몇번째 놈인지
            HashMap<Integer,Double> map = new HashMap<>();
            double[] array = new double[10];
            for(int i=0; i<A; i++){ //열명에게 3개짜리 배열을 생성.
                double[] arr = new double[3];
                double answer = 0;
                // 학생들의 점수 입력.
                for(int j=0; j<arr.length; j++){
                    arr[j] = sc.nextDouble();
                }
                answer += (arr[0] * 35)/100;
                answer += (arr[1] * 45)/100;
                answer += (arr[2] * 20) /100;
                map.put(i+1,answer);
                array[i] = answer;
            }
            Arrays.sort(array);
            String[] grades = {"D0","C-","C0","C+","B-","B0","B+","A-","A","A+"};
            HashMap<Double,String> gradeMap = new HashMap<>();
            for(int i=0; i<grades.length; i++){
                gradeMap.put(array[i],grades[i]);
            }
            double ans = map.get(pick);
            String realAns = gradeMap.get(ans);
            System.out.print("#" + t +" ");
            System.out.println(realAns);
        }
    }
}
