package me.t.stydy.junit.demo1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();

	// 先将结果清零
	@Before
	public void setUp() {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(5);
		calculator.add(-1);
		assertEquals(4, calculator.getResult());
	}

	/*
	 * fail
	 * fail public static void fail(String message) Fails a test with the given
	 * message. Parameters: message - the identifying message for the
	 * AssertionError (null okay) See Also: AssertionError
	 * fail public static void fail() Fails a test with no message.
	 * 
	 * Ignore
	 * public @interface Ignore Sometimes you want to temporarily disable a test
	 * or a group of tests. Methods annotated with Test that are also annotated
	 * with @Ignore will not be executed as tests. Also, you can annotate a
	 * class containing test methods with
	 * @Ignore and none of the containing tests will be executed. Native JUnit 4
	 * test runners should report the number of ignored tests along with the
	 * number of tests that ran and the number of tests that failed.
	 */
	@Ignore("@Ignore:multiply() is not yet implemmented.")
	@Test
	public void testMultiply() {
		// fail();
		fail("fail:multiply() is not yet implemmented.");
		calculator.multiply(2);
	}
}
