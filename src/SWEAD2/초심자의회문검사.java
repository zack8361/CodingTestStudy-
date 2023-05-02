package SWEAD2;




import java.util.ArrayList;
import java.util.Scanner;

public class 초심자의회문검사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int a=1; a<=N; a++){

            String s = sc.next();
            ArrayList<Character> list1 = new ArrayList<>();
            ArrayList<Character> list2 = new ArrayList<>();
            for(int i=0; i<s.length()/2; i++){
                list1.add(s.charAt(i));
            }
            for(int i=s.length()-1; i>s.length()/2; i--){
                list2.add(s.charAt(i));
            }

            int count = 0;
            for(int i=0; i<list1.size(); i++){
                if(list1.get(i) != list2.get(i)){
                    count++;
                    break;
                }
            }
            if(count >0){
                System.out.println("#"+a +" ");
            }
            else {
                System.out.println("#" + a + " ");
            }
        }
    }
}
