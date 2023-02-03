package MyCodingTest;

import java.util.Arrays;

/**
 * 2021 카카오 채용연계형 인턴십
 * 거리두기 확인하기(Lv.2)
 */
public class Programmers81302 {
    public static void main(String[] args) {

        String[][] places= {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        System.out.println(soultion(places));
    }

    private static int[] soultion(String[][] places) {
        int[] answer = new int[places.length];

        for(int k=0; k<places.length; k++){
            char[][]ch = new char[places.length][places[0].length];
            for(int i=0; i<places.length; i++) {
                for (int j = 0; j < places[i].length; j++) {
                    ch[i][j] = places[k][i].charAt(j);
                }
            }
            boolean flag = false;
            for(int i=0; i<places.length; i++){
                for(int j=0; j<places[i].length; j++){
                    if(ch[i][j] == 'P'){
                        if(!check(ch,i,j)){
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                answer[k] = 0;
            }
            else {
                answer[k] = 1;
            }

        }
        return answer;
    }

    private static boolean check(char[][] ch, int i, int j) {
        /**
         * 문제가 인덱스 에러가 많이남
         * 전체에 걸면 인덱스에러가 걸리면 바로 Catch로 감
         * 남은 것들을 확인 불가능
         */try {
            if (ch[i][j + 1] == 'P') {
                return false;
            }
        }
        catch (Exception e){
        }
        try {
            if (ch[i + 1][j] == 'P') {
                return false;
            }
        }
        catch (Exception e){
        }
        try {
            if (ch[i +1][j - 1] == 'P') {
                if (ch[i][j - 1] == 'O' || ch[i + 1][j] == 'O') {
                    return false;
                }
            }
        }
        catch (Exception e){
        }
        try {
            if (ch[i + 1][j + 1] == 'P') {
                if (ch[i][j + 1] == 'O' || ch[i+1][j] == 'O') {
                    return false;
                }
            }
        }
        catch (Exception e){
        }
        try {
            if (ch[i][j + 2] == 'P') {
                if (ch[i][j + 1] == 'O') {
                    return false;
                }
            }
        }
        catch (Exception e){
        }
        try {
            if (ch[i + 2][j] == 'P') {
                if (ch[i + 1][j] == 'O') {
                    return false;
                }
            }
        }
        catch (Exception e){
        }
        return true;

    }
}
