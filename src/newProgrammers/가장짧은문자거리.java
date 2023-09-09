package newProgrammers;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class 가장짧은문자거리 {
    public static void main(String[] args) {
        String s ="teachermode";
        String t = "e";
        System.out.println(solution(s,t));
    }

    private static int[] solution(String s, String t) {

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals(t)){
                cnt++;
            }
        }

        int[] arr = new int[cnt];

        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals(t)){
                arr[a++] = i+1;
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals(t)){
                answer[i] = 0;
            }
            else {
                int ans = Integer.MAX_VALUE;
                for (int j = 0; j < arr.length; j++) {
                    int mx = (Math.abs((i+1)-arr[j]));
                    ans = Math.min(ans,mx);
                }
                answer[i] = ans;
            }
        }

        System.out.println("answer = " + Arrays.toString(answer));


        return new int[0];
    }
}
