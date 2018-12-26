package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.codingdojo.LeapYear;

class LeapYearTest {

	private LeapYear leapYear;

	@BeforeEach
	public void initInputs() {
		leapYear = new LeapYear();
	}

	@Test
	void testDivisibleBy400() {
		Assertions.assertTrue(leapYear.isLeapYear(2000));
	}

	@Test
	void testDivisibleBy100ButNot400() {
		Assertions.assertFalse(leapYear.isLeapYear(1900));
	}

	@Test
	void testDivisibleBy4ButNotBy100() {
		Assertions.assertTrue(leapYear.isLeapYear(2012));
	}

	@Test
	void testNotDivisibleBy4() {
		Assertions.assertFalse(leapYear.isLeapYear(2017));
	}

	@Test
	void testNotDivisibleBy4000() {
		Assertions.assertFalse(leapYear.isLeapYear(4000));
	}
}