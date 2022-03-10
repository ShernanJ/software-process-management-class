import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultipleOf5Test {

	@Test
	void testGood() {
		int num = 10;
		
		boolean output = (num >= 1 && num <= 100) && num % 5 == 0;
		assertTrue(output == true, "Number is not multipliable by 5");
	}
	
	@Test
	void testBad() {
		int num = 12;
		
		boolean output = (num >= 1 && num <= 100) && num % 5 == 0;
		assertTrue(output == false, "Number is multipliable by 5, Expected not to be for this test");
	}
	
	@Test
	void testBoundary() {
		int num = 101;
		boolean output = (num <= 0 || num >= 101);
		assertTrue(output == true, "Number should be inside of the range 1-100, expected not to be for this test");
	}
}
