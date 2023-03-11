package JordyBaekjoon;

import java.util.Scanner;

class Player {
    public static String name;

    static void getWordFromUser(int n) { // 참가자의 이름 필드, 단어 입력받음
        System.out.print("참가자의 이름을 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
    }
    static Boolean checkSuccess(String w) { // 끝말잇기 성공여부, 게림 진행여부 판별

        String startWord = "아버지";
        int lastIndex = startWord.length() - 1; // 마지막 문자에 대한 인덱스
        char lastChar = startWord.charAt(lastIndex); // 마지막 문자
        char firstChar = startWord.charAt(0); //첫 번째 문자
        if(lastChar != w.charAt(0)){
            return false;
        }
        return true;
    }
}
public class WordGameApp {
    WordGameApp() { // 생성자

    }

    public static void run() { // 게임 진행, 참가자 숫자만큼 Player 객체를 배열로 생성
        System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] s = new String[num];
        for (int i = 0; i < s.length; i++) {
            Player.getWordFromUser(i);
            s[i] = Player.name;
        }
        System.out.println("시작하는 단어는 아버지입니다.");
        while (true) {
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i] + ">>");
                String word = scanner.next();
                if (!Player.checkSuccess(word)) {
                    System.out.println(s[i] + "이 졌습니다.");
                    break;
                }
            }
            break;
        }

    }

    public static void main(String[] args) {
        System.out.println("끝말잇기 게임을 시작합니다….");
        run();
    }
}
