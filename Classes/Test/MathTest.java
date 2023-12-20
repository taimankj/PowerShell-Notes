package Classes.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Classes.Math;

class MathTest {
	/*
	 * Happy Path -
	 * Edge Cases - 
	 */
	public static Math math = new Math();

	@Test
	void testMultiplyReturnsValues() {
		int product = math.multiply(2, 5);
		assertEquals(10,product);
	}
	
	@Test
	void testDividesReturnsCorrectValues() {
		int result = math.divide(5, 2);
		assertEquals(2, result);
	}
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a)); //of course there is an opposite, assertFalse()
	}
	
	@Test
	void testDivideThrowsExceptionWhenDividingBy0() {
		assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
	}

}
