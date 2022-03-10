package time;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetTotalSeconds() {
		int seconds = Time.getTotalSeconds("12:05:05");
		assertTrue( seconds==43505, "The seconds were not calculated properly");
	}

//	@Test
//	void testGetSeconds() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetTotalMinutes() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetTotalHours() {
//		fail("Not yet implemented");
//	}

}
