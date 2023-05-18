package newSWEAD2;

import java.util.Arrays;
import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // tc 개수 입력
        for(int tc = 1; tc<=T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr =new int[N][N];
            String answer = "";
            int cnt = 0;
            for(int i=0; i<M; i++){
                answer+="1";
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<arr.length; i++){
                String result = "";
                String result2 = "";
                for (int j = 0; j < arr.length; j++) {
                    result+=arr[i][j];
                    result2+=arr[j][i];
                }

                String[] str = result.split("0");
                String[] str2 = result2.split("0");
                for (String s : str) {
                    if(s.equals(answer)){
                        cnt++;
                    }
                }
                for (String s : str2) {
                    if(s.equals(answer)){
                        cnt++;
                    }
                }
            }
            System.out.println("#" + tc +" " + cnt);
        }
    }
}
