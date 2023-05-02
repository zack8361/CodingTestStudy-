package SWEAD2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 간단한369게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str =new String[N];
        int a = 0;
        for (int i = 1; i <=N; i++) {
            str[a++] = String.valueOf(i);
        }
        for(int i=0; i<str.length; i++){
            int count = 0;
            String answer = "";
            if(str[i].contains("3") || str[i].contains("6") || str[i].contains("9")){
                for(int j=0; j<str[i].length(); j++){
                    if(str[i].charAt(j) == '3' || str[i].charAt(j) == '6' || str[i].charAt(j) =='9'){
                        count++;
                    }
                }
            }
            if(count>0){
                for(int k=0; k<count; k++){
                    answer+="-";
                }
                str[i] = answer;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++){
            sb.append(str[i]).append(" ");
        }
        System.out.println(sb);
    }
}
