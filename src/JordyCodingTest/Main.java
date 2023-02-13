package JordyCodingTest;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i == 2){
                continue;
            }
            else if(i==9){
                break;
            }
            System.out.println(i);
        }
    }
}
