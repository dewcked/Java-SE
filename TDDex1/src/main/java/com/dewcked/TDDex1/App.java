package com.dewcked.TDDex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program that prints gap between 2 days
 * Made by dewcked
 */
public class App 
{
    public static void main( String[] args )
    {
    	CalcGap();
    }
    public static void CalcGap() {
    	/**
         * TODO: 두 날짜(YYYYMMDD)의 차이일자를 구한다.
    	 * TODO: 특정일자의 총 일수를 구한다.
    	 *   전년도까지의 총 일수를 구한다.
    	 *   전월까지의 총 일수를 구한다.
    	 *   해당일자까지의 총 일수를 구한다.
    	 */
    	int first, second;
    	String operator;
    	Scanner s = new Scanner(System.in);
    	System.out.println("다음과 같은 형식으로 입력해주세요.");
    	System.out.println("YYYYMMDD - YYYYMMDD");
    	try {
	    	first = s.nextInt();
			operator = s.next();
			if(!operator.equals("-")) {
				s.close();
				throw new InputMismatchException();
			}
			second = s.nextInt();
			System.out.println(Integer.toString(first) + " - " + Integer.toString(second) + " = " + Integer.toString(first-second));
    	} catch(InputMismatchException e) {
    		System.out.println("입력 형식이 맞지 않습니다.");
    	}
    	s.close();
    }
}
