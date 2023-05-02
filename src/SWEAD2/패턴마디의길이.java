package SWEAD2;

import java.util.HashMap;
import java.util.Scanner;

public class 패턴마디의길이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int a=0; a<N; a++){
            String s = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                if(map.get(s.charAt(i)) == null){
                    map.put(s.charAt(i),1);
                }
                else {
                    map.put(s.charAt(i),map.get(s.charAt(i)) +1);
                }
            }
            System.out.println(map);
        }
    }
}
