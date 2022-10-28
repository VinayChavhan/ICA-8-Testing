import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    urinals testObj = new urinals();

    //Test for wrong input
    @Test
    void test1goodString() {
        String input = "Vinay";
        assertFalse(testObj.goodString(input.toCharArray()));
    }
    //Test for invalid input
    @Test
    void test2goodString() {
        String input = "110";
        assertFalse(testObj.goodString(input.toCharArray()));
    }
    //Test for valid inputs
    @Test
    void test3goodString() {
        String input = "10001";
        assertTrue(testObj.goodString(input.toCharArray()));
    }
    @Test
    void test4goodString() {
        String input = "1001";
        assertTrue(testObj.goodString(input.toCharArray()));
    }
    @Test
    void test5goodString() {
        String input = "00000";
        assertTrue(testObj.goodString(input.toCharArray()));
    }

    @Test
    void test6goodString() {
        String input = "0000";
        assertTrue(testObj.goodString(input.toCharArray()));
    }

    @Test
    void test7goodString() {
        String input = "01000";
        assertTrue(testObj.goodString(input.toCharArray()));
    }

    @Test
    void test8goodString() {
        String input = "00000000000000000000";
        assertTrue(testObj.goodString(input.toCharArray()));
    }

    //Test for string larger than 20
    @Test
    void test1countUrinals() {
        String input = "0100001000010000100001000000010000100001000";
        assertFalse(testObj.countUrinals(input));
    }

    @Test
    void test2countUrinals() {
        String input = "0100001000010000100001000";
        assertFalse(testObj.countUrinals(input));
    }

    @Test
    void test3countUrinals() {
        String input = "000000";
        assertTrue(testObj.countUrinals(input));
    }

    //Test for empty string
    @Test
    void test4countUrinals() {
        String input = "";
        assertFalse(testObj.countUrinals(input));
    }
    @Test
    void test1checkUrinals() {
        String input = "Vinay";
        Assertions.assertEquals(0, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test2checkUrinals() {
        String input = "110";
        Assertions.assertEquals(0, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test3checkUrinals() {
        String input = "10001";
        Assertions.assertEquals(1, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test4checkUrinals() {
        String input = "1001";
        Assertions.assertEquals(0, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test5checkUrinals() {
        String input = "00000";
        Assertions.assertEquals(3, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test6checkUrinals() {
        String input = "0000";
        Assertions.assertEquals(2, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test7checkUrinals() {
        String input = "01000";
        Assertions.assertEquals(1, testObj.checkUrinals(input.toCharArray()));
    }

    @Test
    void test8checkUrinals() {
        String input = "00000000000000000000";
        Assertions.assertEquals(10, testObj.checkUrinals(input.toCharArray()));
    }

    //check if no exception are raised
    @Test
    void test1initiate_process() {
        Assertions.assertDoesNotThrow(() -> testObj.initiate_process("urinal.dat"));
    }

    //check if FileNotFoundException is handled
    @Test
    void test2initiate_process() {
        Exception thrown = assertThrows(
                Exception.class,
                () -> testObj.initiate_process("abc.dat"),
                "Expected initiate_process() to throw, but it didn't"
        );
        System.out.println(thrown.getMessage());
        assertTrue(thrown.getMessage().contains("File is not present"));
    }

}