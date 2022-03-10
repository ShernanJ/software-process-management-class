import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YearTest {

	@Test
	void testIsLeap() {
		int year = 2000;
		boolean output = Year.isLeap(year);
		assertTrue(output == true, "The year is not a leap year");
	}

}
