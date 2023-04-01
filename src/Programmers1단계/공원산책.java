package Programmers1단계;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(solution(park,routes));
    }
// E2, s2, w1
    private static int[] solution(String[] park, String[] routes) {
        String[][] round = new String[park.length][park[0].length()];

        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                round[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        int x = 0;
        int y = 0;

        for(int i = 0; i<round.length; i++) {
            for (int j = 0; j < round[i].length; j++) {
                if (round[i][j].equals("S")) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        // X 를 만나거나
        // 추가되어서 2를 넘어가거나 두개만 예외처리 하면돼

        for(int a=0; a<routes.length; a++){
            char dir = routes[a].charAt(0); // 방향 동서남북
            int len = Integer.parseInt(String.valueOf(routes[a].charAt(2))); // 방향에 따른 길이 변화.
            if(dir == 'E'){
                for(int i=0; i<len; i++){
                    try {
                        if (!round[x][y + 1].equals("X")) {
                            y += 1;
                        } else {
                            y = y - i;
                            break;
                        }
                    }
                    catch (Exception e){
                        y = y - i;
                        break;
                    }
                }
            }
            else if(dir == 'S'){
                for(int i=0; i<len; i++){
                    try {
                        if (!round[x+1][y].equals("X")) {
                            x += 1;
                        } else {
                            x = x - i;
                            break;
                        }
                    }
                    catch (Exception e){
                        x = x - i;
                        break;
                    }

                }
            }
            else if(dir == 'N'){
                for(int i=0; i<len; i++){
                    try {
                        if (!round[x-1][y].equals("X")) {
                            x -= 1;
                        } else {
                            x = x + i;
                            break;
                        }
                    }
                    catch (Exception e){
                        x = x +i;
                        break;
                    }
                }
            }
            else {
                for(int i=0; i<len; i++){
                    try {
                        if (!round[x][y - 1].equals("X")) {
                            y -= 1;
                        } else {
                            y = y + i;
                            break;
                        }
                    }
                    catch (Exception e){
                        y = y + i;
                        break;
                    }
                }
            }
        }
        int[] arr = {x,y};
        return arr;
    }
}
