package JordyCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class numberFriends {
    public static void main(String[] args) {
        String X = "100";
        String Y = "203045";
        System.out.println(solution(X,Y));
    }

    private static String solution(String x, String y) {
        String[] str = x.split("");
        String[] str2 = y.split("");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<str2.length; i++){
            list.add(str2[i]);
        }
        for(int i=0; i<str2.length; i++){
            if(list.contains(str[i])){
                list.remove(str[i]);
            }
        }
        System.out.println(list);

        return null;
    }
}
