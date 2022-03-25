package lt.viko.eif.tpetrauskas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {

    @Test
    void task1() {
        int a = 10;
        int b = 10;

        assertEquals(true, a == b);
        assertEquals(false, a < b);
        assertEquals(true, a <= b);
        assertEquals(false, a > b);
        assertEquals(true, a >= b);
    }

    @Test
    void task2() {
        boolean b1 = true;
        boolean b2 = false;


        assertEquals(false, (b1 == b2));
        assertEquals(true, (b1 != b2));
    }

    @Test
    void task3() {
        int oddNum = 3;
        int evenNum = 4;

        assertEquals(false, oddNum % 2 == 0);
        assertEquals(true, evenNum % 2 == 0);
    }

    @Test
    void task4() {
        int oddNum = 3;
        int evenNum = 4;

        assertEquals(true, oddNum % 2 != 0);
        assertEquals(false, evenNum % 2 != 0);
    }

    @Test
    void task5() {
        boolean b1 = true;
        boolean b2 = false;

        assertEquals(false, !b1);
        assertEquals(true, !b2);

    }

    @Test
    void task6() {
        int a = -1;
        int b = -2;
        int c = 1;
        int d = 101;
        int e = 102;
        int f = 99;
        int g = 200;

        assertEquals(false, (a == b || a < 0 && b > 0 || a > 1001 && b > 1001));
        assertEquals(true, (b == c || b < 0 && c > 0 || b > 1001 && c > 1001));
        assertEquals(true, (a == a || a < 0 && a > 0 || a > 1001 && a > 1001));
        assertEquals(false, (d == e || d < 0 && e > 0 || d > 1001 && e > 1001));
        assertEquals(false, (f == g || f < 0 && g > 0 || f > 1001 && g > 1001));
    }
}