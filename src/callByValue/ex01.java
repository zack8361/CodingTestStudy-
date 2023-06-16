package callByValue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Call By Value (값에 의한 호출)
 * 메서드를 호출할때, 값을 넘겨주기 때문에 Pass By Value 라고도 부른다.
 * JAVA는 오직 Call by Value 로만 동작한다.
 */
public class ex01 {
    @Test
    static void test() {
        int a = 1;
        int b = 2;

        assertEquals(a,1);
        assertEquals(b,2);
        modify(a,b);

        assertEquals(a,1);
        assertEquals(b,1);
    }
    private static void modify(int a, int b) {
        a = 5;
        b = 10;
    }
}
