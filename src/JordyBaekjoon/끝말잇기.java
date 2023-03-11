package JordyBaekjoon;

import java.util.Scanner;

public class 끝말잇기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.print("게임을 시작하는 인원은 몇명입니까 >>> ");
        int N = sc.nextInt();
        String[] arr = new String[N];

        String start = "아버지";

        for(int i=0; i<N; i++){
            System.out.print("참가자의 이름을 입력하세요 >>");
            arr[i] = sc.next();
        }
        while (true){
            System.out.print(arr[0] + ">>");
            String a = sc.next();
            if(start.charAt(start.length()-1) != a.charAt(0)){
                System.out.println(arr[0] + "   이졌습니다.");
                break;
            }
            System.out.print(arr[1] + ">>");
            String b = sc.next();
            if(a.charAt(a.length()-1) != b.charAt(0)){
                System.out.println(arr[1] + " 이졌습니다.");
                break;
            }

            System.out.print(arr[2] + ">>");
            String c = sc.next();
            if(b.charAt(b.length()-1) != c.charAt(0)){
                System.out.println(arr[2] + "  이 졌습니다.");
                break;
            }
            
        }
    }
}
