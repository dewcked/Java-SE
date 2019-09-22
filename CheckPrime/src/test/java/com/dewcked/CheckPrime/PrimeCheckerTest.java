package com.dewcked.CheckPrime;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {
	
	PrimeChecker checker = new PrimeChecker();

	//Test case 1
	@Test
	public void testPrime_true() {
		assertTrue(checker.primeCheck(3));
	}

	//Test case 2,3
	@Test
	public void testPrime_false() {
		assertFalse(checker.primeCheck(0));
		assertFalse(checker.primeCheck(1000));
	}

	//Test case 7
	@Test
	public void testPrime_checkArgs_char_input() {
		try {
			String[] args = new String[1];
			args[0] = "r";
			checker.checkArgs(args);
			fail("Should raise an Exception");
		} catch (Exception success) {
			//successful test
			System.out.println(this.getClass().toString()+" -- 문자 인자를 허용하지 않습니다. 예외발생됨 V");
		}
	}

	//Test case 5
	@Test
	public void testPrime_checkArgs_above_upper_bound() {
		try {
			String[] args = new String[1];
			args[0] = "1001";
			checker.checkArgs(args);
			fail("Should raise an Exception");
		} catch (Exception success) {
			//successful test
			System.out.println(this.getClass().toString()+" -- 인자로 범위를 넘어선 값을 허용하지 않습니다. 예외발생됨 V");
		}
	}

	//Test case 4
	@Test
	public void testPrime_checkArgs_neg_input() {
		try {
			String[] args = new String[1];
			args[0] = "-1";
			checker.checkArgs(args);
			fail("Should raise an Exception");
		} catch (Exception success) {
			//successful test
			System.out.println(this.getClass().toString()+" -- 인자로 음수를 허용하지 않습니다. 예외발생됨 V");
		}
	}

	//Test case 6
	@Test
	public void testPrime_checkArgs_2_inputs() {
		try {
			String[] args = new String[2];
			args[0] = "5";
			args[1] = "99";
			checker.checkArgs(args);
			fail("Should raise an Exception");
		} catch (Exception success) {
			//successful test
			System.out.println(this.getClass().toString()+" -- 두 개 이상의 인자를 허용하지 않습니다. 예외발생됨 V");
		}
	}

	//Test case 8
	@Test
	public void testPrime_checkArgs_0_inputs() {
		try {
			String[] args = new String[0];
			checker.checkArgs(args);
			fail("Should raise an Exception");
		} catch (Exception success) {
			//successful test
			System.out.println(this.getClass().toString()+" -- 공백 인자를 허용하지 않습니다. 예외발생됨 V");
		}
	}
	
	//Test case 9
	@Test
	public void testPrime_0_to_1000() {
		int[] Primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
				31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
				73, 79, 83, 89, 97, 101, 103, 107, 109, 113,
				127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
				179, 181, 191, 193, 197, 199, 211, 223, 227, 229,
				233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
				283, 293, 307, 311, 313, 317, 331, 337, 347, 349,
				353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
				419, 421, 431, 433, 439, 443, 449, 457, 461, 463,
				467, 479, 487, 491, 499, 503, 509, 521, 523, 541,
				547, 557, 563, 569, 571, 577, 587, 593, 599, 601,
				607, 613, 617, 619, 631, 641, 643, 647, 653, 659,
				661, 673, 677, 683, 691, 701, 709, 719, 727, 733,
				739, 743, 751, 757, 761, 769, 773, 787, 797, 809,
				811, 821, 823, 827, 829, 839, 853, 857, 859, 863,
				877, 881, 883, 887, 907, 911, 919, 929, 937, 941,
				947, 953, 967, 971, 977, 983, 991, 997};
		for(int i=0;i<=1000;i++) {
			if(checker.primeCheck(i) == true) {
				boolean isPrime = false;
				for(int j=0;j<Primes.length;j++) {
					if(i == Primes[j])
						isPrime = true;
				}
				if(!isPrime)
					fail(i+"는 소수가 아니지만 primeCheck 함수에서 소수로 판별합니다.");
			} else if(checker.primeCheck(i) == false) {
				for(int j=0;j<Primes.length;j++) {
					if(i == Primes[j])
						fail(i+"는 소수이지만 primeCheck 함수에서 소수로 판별하지 않습니다.");
				}
			}
		}
		System.out.println("=== Test Successful ===");
	}
}