package com.dewcked.TriangleChecker;

import static org.junit.Assert.*;
import org.junit.Test;
public class TriangleChckerTest2 {
    TriangleChecker1 checker = new TriangleChecker1();
    @Test
    public void testIsoceles1() {
        final String type = checker.check(100, 100, 1);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testIsoceles2() {
        final String type = checker.check(100, 100, 2);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testEquiliteral1() {
        final String type = checker.check(100, 100, 100);
        assertEquals("EQUILATERAL", type);
    }
    @Test
    public void testIsoceles3() {
        final String type = checker.check(100, 100, 199);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testInvalid1() {
        final String type = checker.check(100, 100, 200);
        assertEquals("INVALID", type);
    }
    @Test
    public void testIsoceles4() {
        final String type = checker.check(100, 1, 100);
        assertEquals("ISOSCELES", type);
    } 
    @Test
    public void testIsoceles5() {
        final String type = checker.check(100, 2, 100);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testEquiliteral2() {
        final String type = checker.check(100, 100, 100);
        assertEquals("EQUILATERAL", type);
    }
    @Test
    public void testIsoceles6() {
        final String type = checker.check(100, 199, 100);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testInvalid2() {
        final String type = checker.check(100, 200, 100);
        assertEquals("INVALID", type);
    }
    @Test
    public void testIsoceles7() {
        final String type = checker.check(1, 100, 100);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testIsoceles8() {
        final String type = checker.check(2, 100, 100);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testEquiliteral3() {
        final String type = checker.check(100, 100, 100);
        assertEquals("EQUILATERAL", type);
    }
    @Test
    public void testIsoceles9() {
        final String type = checker.check(199, 100, 100);
        assertEquals("ISOSCELES", type);
    }
    @Test
    public void testIsoceles10() {
        final String type = checker.check(200, 100, 100);
        assertEquals("ISOSCELES", type);
    }
}
