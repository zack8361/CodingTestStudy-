package Programmers0단계;

import java.util.Arrays;

public class 광물캐기 {
    public static void main(String[] args) {
        int[] picks = {0,0,0};
        String[] minerals = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
        System.out.println(solution(picks,minerals));
    }

    private static int solution(int[] picks, String[] minerals) {
        // picks =  ( 다이아, 철, 돌  ) 순서.정렬 필요하네.
        for(int i=0; i<picks.length; i++){
            picks[i] = picks[i]*5;
        }
        System.out.println(Arrays.toString(picks));
        int a = 0;
        int result = 0;
        for(int i=0; i<picks.length; i++){
            while (true){
                if(picks[i] == 0 || a>=minerals.length){
                    break;
                }
                if(i == 0){
                    if(minerals[a].equals("diamond")){
                        System.out.println("와씨?");
                        result +=1;
                    }
                    else if(minerals[a].equals("iron")){
                        result +=1;
                    }
                    else if(minerals[a].equals("stone")){
                        result +=1;
                    }
                }
                else if(i == 1){
                    if(minerals[a].equals("diamond")){
                        System.out.println("와씨?");
                        result +=5;
                    }
                    else if(minerals[a].equals("iron")){
                        result +=1;

                    }
                    else if(minerals[a].equals("stone")){
                        result +=1;
                    }

                }
                else if(i == 2){
                    if(minerals[a].equals("diamond")){
                        result +=25;

                    }
                    else if(minerals[a].equals("iron")){
                        result +=5;

                    }
                    else if(minerals[a].equals("stone")){
                        result +=1;
                    }
                }
                picks[i] = picks[i]-1;
                a++;
            }
        }
        System.out.println(result);
        return 0;
    }
}
