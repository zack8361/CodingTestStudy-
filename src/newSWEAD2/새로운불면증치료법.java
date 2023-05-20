package newSWEAD2;

import java.util.HashMap;
import java.util.Scanner;

public class 새로운불면증치료법 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc<=T; tc++){
            HashMap<String,Integer> map = new HashMap<>();
            for(int i= 0; i<=9; i++){
                map.put(String.valueOf(i),0);
            }
            int num = sc.nextInt();
            int a = 0;
            int realAns = 0;
            while (true){
                a++;
                int count = 0;
                int result = num * a;
                String answer = String.valueOf(result);
                for(int i=0; i<answer.length(); i++){
                    map.put(String.valueOf(answer.charAt(i)),1);
                }
                for (String s : map.keySet()) {
                    if(map.get(s) == 1){
                        count++;
                    }
                }
                if(count == 10){
                    realAns = result;
                    break;
                }
            }
            System.out.println("#" + tc +" " + realAns);
        }
    }
}
