package 고득점kit해시;

import java.util.Arrays;
import java.util.HashMap;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phone_book) {

        if(phone_book.length <= 1){
            return false;
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i],1);
        }

        for(String i: map.keySet()){
            for(int j=0; j<phone_book.length; j++){
                if(i.length()<= phone_book.length){
                    continue;
                }
                if(i.equals(phone_book[j])){
                    continue;
                }
                if(i.contains(phone_book[j])){
                    return false;
                }
            }
        }
        return true;
    }
}
