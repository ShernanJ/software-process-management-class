package time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetMilliSeconds() {
//		fail("Not yet implemented");
		int MilliSeconds = Time.getMilliSeconds("12:05:05:05");
		assertTrue( MilliSeconds==5, "The seconds were not calculated properly");
	}

}
