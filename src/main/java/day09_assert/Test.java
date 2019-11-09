package day09_assert;

import static day09_assert.Assert.*;

public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        assertEquals(s1, s2);
        
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        assertEquals(b1, b2);
        
        Ball b3 = b1;
        assertNotNull(b3);
    }
}
