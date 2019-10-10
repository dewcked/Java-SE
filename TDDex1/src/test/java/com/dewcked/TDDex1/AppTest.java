package com.dewcked.TDDex1;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(AppTest.class);
    }
    
    public void testGetYearDay() {
    	//Subdate는 가상의 클래스이다.
    	//0년이란 것은 존재하지 않기 때문에 1년까지의 총 일 수는 0이 되어야 한다. (최초 일자를 1년 1월 1일이라고 나름대로 설정한 것이다.)
        assertEquals(0, SubDate.getYearDay(1));
        //2년 까지의 총 일 수는 1년 1월 1일부터 2년 1월 1일까지이므로 365일이 될 것이다.
        assertEquals(365, SubDate.getYearDay(2));
        //5년 미만의 총 일수를 구하는 테스트
        assertEquals(365+365+365+366, SubDate.getYearDay(5));
    }
    public void testLeapYear() {
        assertTrue(SubDate.isLeapYear(0));
        assertFalse(SubDate.isLeapYear(1));
        assertTrue(SubDate.isLeapYear(4));
        assertTrue(SubDate.isLeapYear(1200));
        assertFalse(SubDate.isLeapYear(700));
    }
    public void testGetMonthDay() {
        assertEquals(0, SubDate.getMonthDay(1, true));
        assertEquals(31, SubDate.getMonthDay(2, false));
        assertEquals(31+28, SubDate.getMonthDay(3, false));
        assertEquals(31+29, SubDate.getMonthDay(3, true));
    }
    public void testGetTotalDay() {
        assertEquals(1, SubDate.getTotalDay("00010101"));
        assertEquals(366, SubDate.getTotalDay("00020101"));
    }
    public void testSubDate() {
        assertEquals(1, SubDate.sub("20061231", "20070101"));
        assertEquals(31+28+30+31+14, 
                SubDate.sub("20070101", "20070515"));
        assertEquals(31+29+30+31+14, 
                SubDate.sub("20080101", "20080515"));
    }
}