package Programmers2단계;

import java.util.HashMap;

public class 스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill,skill_trees));
    }

    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < skill.length(); i++) {
            map.put(String.valueOf(skill.charAt(i)),i+1);
        }
        for (int i = 0; i < skill_trees.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if(map.containsKey(String.valueOf(skill_trees[i].charAt(j)))){
                    count++;
                    if(map.get(String.valueOf(skill_trees[i].charAt(j))) == count){
                        continue;
                    }
                    else {
                        flag = true;
                    }
                }
            }
            if(!flag){
                answer++;
            }
        }
        return answer;
    }
}
