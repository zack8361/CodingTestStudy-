package SWEAD3;

import java.util.Arrays;
import java.util.Scanner;

public class 농작물수확하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=1; t<=tc; t++){
            int N = sc.nextInt();
            String[] str = new String[N]; // 5개짜리 배열

            for(int i=0; i<str.length; i++){   // 5개짜리 String 을 배열로 만들어
                str[i] = sc.next();
             }
            String[][] map = new String[N][N];
            for(int i=0; i<map.length; i++){
                for(int j=0; j<map.length; j++){
                    map[i][j] = String.valueOf(str[i].charAt(j));
                }
            }
            // 만약 맵이 1개짜리면 그냥 그안에것 리턴.
            int answer = 0;
            if(N == 1){
                answer= Integer.parseInt(map[0][0]);
            }

            for(int i=0; i<map.length; i++){
                for(int j=0; j<map.length; j++){
                    answer+=Integer.parseInt(map[i][j]);
                }
            }


            for(int i=0; i<map.length; i++){
                for(int j=0; j<map.length; j++){
                    if(i == 0 || i == map.length-1){
                        map[i][N/2] = "0";
                    }
                    if(i < N/2 ){
                        map[i][N/2] = "0";
                        for(int k = 1; k<=i; k++){
                            map[i][N/2 + k] = "0";
                            map[i][N/2 -k] = "0";
                        }
                    }
                    else if(i>N/2){
                        map[i][N/2] = "0";
                        for(int k=1; k<map.length-i; k++){
                            map[i][N/2 + k] = "0";
                            map[i][N/2 -k] = "0";
                        }
                    }
                    else if( i == N/2){
                        map[i][j] = "0";
                    }

                }
            }

            int answer2= 0;
            for(int i=0; i<map.length; i++){
                for(int j=0; j<map.length; j++){
                    if(!map[i][j].equals("0")){
                        answer2+=Integer.parseInt(map[i][j]);
                    }
                }
            }

            System.out.println("#"+t +" " + (answer-answer2));
        }
    }
}
