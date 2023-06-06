package KAKAO인턴쉽;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class 두개뽑아서더하기 {
    private static boolean[] visited;
    private static HashSet<Integer> set;
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] numbers) {
        set = new HashSet<>();
        visited = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            dfs(i,0,0,numbers);
        }


        System.out.println(set);

        int[] answer = new int[set.size()];
        int a = 0;
        for (int i : set) {
            answer[a++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }

    private static void dfs(int now,int depth,int sum , int[] numbers) {
        visited[now] = true;


        if(depth == 1){
            set.add(sum);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(now, depth + 1, numbers[now] + numbers[i], numbers);
                visited[i] = false;
            }
        }
    }
}
