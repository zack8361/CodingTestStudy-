package MyCodingTest;

/**
 * String -> 2차원 Array 변경
 */

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            boolean flag = false;

            if(!check(i)){
                flag = true;
            }


            if(flag){
                System.out.println("good");
            }
            else {
                System.out.println("sex");
            }
        }
    }

    private static boolean check(int i) {
        if(i>1){
            return true;
        }
        return false;
    }
}
