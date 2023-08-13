package telran.measure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.measure.WeightUnit;

class WeightUnitTest {

	@Test
	void convertTest() {
		assertEquals(0.001f, WeightUnit.KG.convert(WeightUnit.TN, 10), 0.01);
	}

}
