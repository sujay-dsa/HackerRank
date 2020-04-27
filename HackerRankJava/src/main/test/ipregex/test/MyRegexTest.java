package ipregex.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class MyRegexTest {
	
	String range = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	String pattern = range + "\\." + range + "\\." + range + "\\." + range;
	
	@ParameterizedTest
	@ValueSource(strings = {"255","000","99","256"})
	public void testRange(String IP) {
		assertTrue(IP.matches(range));
	}
	

	@ParameterizedTest
	@ValueSource(strings = {"000.12.12.034","121.234.12.12","23.45.12.56","0.0.0.0"})
	public void testvalidIP(String IP) {
		assertTrue(IP.matches(pattern));
	}
	
}
