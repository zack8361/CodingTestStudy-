package Programmers2단계;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 전화번호목록 {
    private static boolean[] visited;
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88","123123"};
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}
