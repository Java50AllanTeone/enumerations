package telran.time.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

import telran.time.DayOfWeek;
import telran.time.TypeDisplay;

import org.junit.jupiter.api.Test;

class DayOfWeekTest {

	@Test
	@Disabled
	void test() {
		assertEquals(0, getOrdinalDayOfWeek(DayOfWeek.MON));
		assertEquals("MON", getNameDayOfWeek(DayOfWeek.MON));
	}
	
	
	private int getOrdinalDayOfWeek(DayOfWeek day) {
		return day.ordinal();
	}
	
	
	private String getNameDayOfWeek(DayOfWeek day) {
		return day.name();
	}
	
	
	@Test
	void displayNameTest() {
		assertEquals("Fri", DayOfWeek.FRI.displayName(TypeDisplay.SHORT));
		assertEquals("Friday", DayOfWeek.FRI.displayName(TypeDisplay.FULL));
	}
	
	@Test
	void displayValueTest() {
		assertEquals(5, DayOfWeek.FRI.getValue());
	}
	
	@Test
	void plusDaysTest() {
		assertEquals(DayOfWeek.SAT, DayOfWeek.FRI.plusDays(22));
	}
	
	@Test
	void minusDaysTest() {
		assertEquals(DayOfWeek.THU, DayOfWeek.FRI.minusDays(22));
	}
	
	@Test
	void betweenTest() {
		assertEquals(1, DayOfWeek.FRI.between(DayOfWeek.SAT));
		assertEquals(6, DayOfWeek.FRI.between(DayOfWeek.THU));
	}

}
