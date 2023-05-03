package SWEAD2;

import java.util.ArrayList;
import java.util.Scanner;

public class 중간평균값구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int max = -1;
            int min = 10001;
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<10; i++){
                int num = sc.nextInt();
                if(num>max){
                    max = num;
                }
                if(min>num){
                    min = num;
                }
                list.add(String.valueOf(num));
            }
            if(list.contains(String.valueOf(min))){
                list.remove(String.valueOf(min));
            }
            if(list.contains(String.valueOf(max))){
                list.remove(String.valueOf(max));
            }

            int sum = 0;
            for(int i=0; i<list.size(); i++){
                sum+=Integer.valueOf(list.get(i));
            }
            System.out.println("#" + t +" ");
            System.out.println(sum/list.size());
        }
    }
}
