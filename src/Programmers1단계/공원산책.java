package Programmers1단계;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(solution(park,routes));
    }

    private static int[] solution(String[] park, String[] routes) {
        String[][] round = new String[park.length][park[0].length()];


        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                round[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        for(int a=0; a<routes.length; a++){
            char dir = routes[a].charAt(0);
            char len = routes[a].charAt(2);
            for(int i = 0; i<round.length; i++){
                for(int j=0; j<round[i].length; j++){
                    if(round[i][j].equals("S")){
                        if(dir == 'E'){

                        }
                    }
                }
            }
        }

        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                System.out.print(round[i][j]);
            }
            System.out.println();
        }

        int[] arr = {};
        return arr;

    }
}
