package newProgrammers1단계;

import java.util.Arrays;

public class 숫자짝궁 {
    private static boolean[] visited;
    public static void main(String[] args) {
        String X = "100";
        String Y = "123450";
        System.out.println(solution(X,Y));
    }

    private static String solution(String x, String y) {
        String answer = "";
        visited = new boolean[y.length()];
        for (int i = 0; i < x.length(); i++) {
            if(y.contains(String.valueOf(x.charAt(i)))){

            }
        }

        for (int i = 0; i < y.length(); i++) {
            if(visited[i]){
                answer += String.valueOf(y.charAt(i));
            }
        }

        if(answer.equals("")){
            return "-1";
        }

        String[] str = answer.split("");
        Arrays.sort(str);
        answer = "";
        for (int i = str.length-1; i >=0 ; i--) {
            answer+=str[i];
        }
        if(str[str.length-1].equals("0")){
            return "0";
        }

        return answer;
    }
}
