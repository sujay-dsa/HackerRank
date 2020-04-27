package datetime.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import datetime.Result;


public class ResultTest {

	@Test
	public void testOutput() {
		assertEquals("WEDNESDAY", Result.findDay(8, 5, 2015));
//		assertEquals("MONDAY", Result.findDay(8, 14, 2017));
//		fail("Objects not equal "+Result.findDay(8, 5, 2015));
	}

}
