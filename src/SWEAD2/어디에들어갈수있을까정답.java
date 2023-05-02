package SWEAD2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class 어디에들어갈수있을까정답 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[][] map = new int[A][A];


            // 배열 입력 하는 공간
            for(int i=0; i<map.length; i++){
                for(int j=0; j<map[0].length; j++){
                    map[i][j] = sc.nextInt();
                }
            }
            // 정답 미리 구해놓기
            String result = ""; // 구해놨어 "111"이 되면 돼.
            int count = 0;
            for(int i=0; i<B; i++){
                result+="1";
            }

            for (int i = 0; i < map.length; i++) {
                String answer = "";
                String answer2 = "";
                for (int j = 0; j < map[0].length; j++) {
                    answer+=map[i][j];
                    answer2+=map[j][i];
                }
                String[] str = answer.split("0");
                String[] str2 = answer2.split("0");
                for(int j=0; j<str.length; j++){
                    if(str[j].equals(result)){
                        count++;
                        break;
                    }
                }
                for(int j=0; j<str2.length; j++){
                    if(str2[j].equals(result)){
                        count++;
                        break;
                    }
                }
            }
            System.out.println("#" + t);
            System.out.println(count);
        }
    }
}
