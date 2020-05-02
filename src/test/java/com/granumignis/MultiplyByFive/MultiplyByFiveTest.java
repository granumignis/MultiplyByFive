package com.granumignis.MultiplyByFive;

import static org.junit.Assert.*;

import org.junit.Test;
import com.granumignis.MultiplyByFive.*;

public class MultiplyByFiveTest {

	@Test
	public void testMultiplyByFive() {
		MultiplyByFive mb5 = new MultiplyByFive();
		assertEquals(25, mb5.multiplyByFive(5));
	}

}
