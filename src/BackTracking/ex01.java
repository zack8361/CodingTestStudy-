package BackTracking;


/**
 * 알파벳 A,B,C,D 를 사용하여 만들수 있는 4글자 문자열을 전부 출력하는 문제를 풀어보자
 * 단 각 알파벳은 무한대로 사용가능하다.
 */
public class ex01 {
    private static boolean[] visited;
    public static void main(String[] args) {
        String[] alp = {"A","B","C","D"};
        visited = new boolean[alp.length];
        dfs(alp,"");
    }

    private static void dfs(String[] alp,String s) {
        if(s.length() == alp.length) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < alp.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(alp, s + alp[i]);
                visited[i] = false;
            }
        }
    }
}
