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

    	int first, second, result;
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
			result = SubDate.sub(Integer.toString(first), Integer.toString(second));
			System.out.println(Integer.toString(first) + " - " + Integer.toString(second) + " = " + Integer.toString(result));
    	} catch(InputMismatchException e) {
    		System.out.println("입력 형식이 맞지 않습니다.");
    	}
    	s.close();
    }
}
