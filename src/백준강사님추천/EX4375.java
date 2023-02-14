package 백준강사님추천;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EX4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.valueOf(br.readLine());
        long num = 1;
        while (true){
            num = num * 10 + 1;
            if(num%n == 0){
                String answer = String.valueOf(num);
                System.out.println(answer.length());
                break;
            }

        }
    }
}
