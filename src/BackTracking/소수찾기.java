package BackTracking;

import java.awt.*;
import java.util.*;

public class 소수찾기 {
     private static HashSet<Integer> set;
    private static int cnt = 0;
    private static boolean[] visited;
    public static void main(String[] args) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }

    private static int solution(String numbers) {
        set = new HashSet<>();

        visited = new boolean[numbers.length()];
        int answer = 0;
        String[] arr = numbers.split("");
        dfs(arr,"");

        Iterator iter = set.iterator();

        while (iter.hasNext()){
            boolean check = false;
            check = isPrime((Integer) iter.next());
            if(check){
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean isPrime(int num) {
        if(num == 1 || num == 0){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    private static void dfs(String[] arr, String s) {
        if(!s.equals("")){
            set.add(Integer.parseInt(s));
        }
        if(s.length() == arr.length){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(arr, s + arr[i]);
                visited[i] = false;
            }
        }
    }
}
