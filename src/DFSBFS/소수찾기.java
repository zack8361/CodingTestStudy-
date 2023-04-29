package DFSBFS;

import java.util.ArrayList;

public class 소수찾기 {

    private static boolean[] visited;
    private static String[] str;
    private static ArrayList<Integer> list;
    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));
    }
    private static void dfs(int depth, String sum) {

        for(int i=0; i<str.length; i++){
            if(!visited[i]){
                visited[i] = true;
                if(!list.contains(Integer.valueOf(sum + str[i]))) {
                    list.add(Integer.valueOf(sum + str[i]));
                }
                dfs(depth + 1, sum + str[i]);
                visited[i] = false;
            }
        }
    }
    public static int solution(String numbers) {
        str = numbers.split("");
        visited = new boolean[str.length];
        list = new ArrayList<>();
        dfs(0, "");
        int answer = 0;
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int prime = list.get(i);
            int count = 0;
            if (prime != 0 && prime != 1) {
                for (int j = 2; j < prime; j++) {
                    if (prime % j == 0) {
                        break;
                    } else count++;
                }
            }
            if (count > 0) {
                answer++;
            }
        }
        return answer;
    }
}
