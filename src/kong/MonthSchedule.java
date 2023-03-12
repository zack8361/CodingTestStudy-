package kong;
import java.util.Scanner;

class Day {
    private String work; /// 하루의 할 일을 나타내는 문자열

    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show(String s) {

        if(work == null)
            System.out.println("없습니다.");
        else
            System.out.println(work + "입니다.");
    }

}

public class MonthSchedule {
    Scanner s = new Scanner(System.in);
    private int selection;
    private int month;

    static String [] c = new String[30]; // Day 객체 배열 생성
    static Day d = new Day();

    public MonthSchedule(int month) { //생성자
        this.month = month;
    }

    private void input(int day) {
        System.out.print("할일(빈칸없이입력)? ");
        c[day]= s.next(); // 할입을 입력받고
        d.set(c[day]);
    }

    public static void view(int day) {
        System.out.println(day+"일의 할일은 ");
        d.show(c[day]);
    }

    public static void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        while(true) {
            System.out.print("할일 (입략:1, 보기:2, 끝내기:3) >>");
            int num = s.nextInt();

            if (num == 3) {
                finish();
                break;
            }
            else {
                if (num == 1) {
                    System.out.print("날짜(1~30)? ");
                    int day = s.nextInt();
                    input(day);
                } else {
                    System.out.print("날짜(1~30)? ");
                    int day = s.nextInt();
                    view(day);
                }}

        }
    }

    public static void main(String[] args) {
        MonthSchedule april  = new MonthSchedule(30); // 4월달의 할 일
        System.out.println("이번달 스케쥴 관리 프로그램.");
        april.run();
    }
}


