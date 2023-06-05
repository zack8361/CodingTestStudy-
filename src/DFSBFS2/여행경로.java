package DFSBFS2;

import java.util.ArrayList;
import java.util.Arrays;

public class 여행경로 {
    private static boolean[] visited;
    private static ArrayList<String > list;
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        System.out.println(solution(tickets));
    }

    private static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>();
        for (int i = 0; i < tickets.length; i++) {
            if(tickets[i][0].equals("ICN")) {
                list.clear();
                list.add("ICN");
                dfs(tickets[i][1], 0, tickets, i);
                visited[i] = false;
            }
        }
        char A = 'A';


        return null;
    }

    private static void dfs(String now, int cnt, String[][] tickets, int vis) {
        visited[vis] =true;

        list.add(now);
        if(cnt == tickets.length-1){
            if(list.size() == tickets.length+1){
                System.out.println(list);
            }
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if(!visited[i] && now.equals(tickets[i][0])){
                dfs(tickets[i][1],cnt+1,tickets,i);
                visited[i] = false;
            }
        }
    }
}
