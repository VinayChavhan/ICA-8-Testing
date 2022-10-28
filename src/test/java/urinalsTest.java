import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    urinals testObj = new urinals();
    @Test
    void checkUrinals() {
    }

    @Test
    void test1goodString() {
        String input = "Vinay";
        Assertions.assertEquals(false, testObj.goodString(input.toCharArray()));
    }
    @Test
    void test2goodString() {
        String input = "110";
        Assertions.assertEquals(false, testObj.goodString(input.toCharArray()));
    }
    @Test
    void test3goodString() {
        String input = "10001";
        Assertions.assertEquals(true, testObj.goodString(input.toCharArray()));
    }
    @Test
    void test4goodString() {
        String input = "1001";
        Assertions.assertEquals(true, testObj.goodString(input.toCharArray()));
    }
    @Test
    void test5goodString() {
        String input = "00000";
        Assertions.assertEquals(true, testObj.goodString(input.toCharArray()));
    }

    void test6goodString() {
        String input = "0000";
        Assertions.assertEquals(true, testObj.goodString(input.toCharArray()));
    }

    void test7goodString() {
        String input = "01000";
        Assertions.assertEquals(true, testObj.goodString(input.toCharArray()));
    }

    void test8goodString() {
        String input = "00000000000000000000";
        Assertions.assertEquals(true, testObj.goodString(input.toCharArray()));
    }

    @Test
    void countUrinals() {
        String input = "0100001000010000100001000";
        Assertions.assertEquals(false, testObj.goodString(input.toCharArray()));
    }

    @Test
    void main() {
    }
}