/**
 * 
 */
package tests.unit;
/**
 * This class contains the test cases for the class {action.SuperFizzBuzz}
 */
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import action.SuperFizzBuzz;
import models.FizzBuzzInput;

public class FizBuzzTest {

	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	}

	
	@After
	public void tearDown() throws Exception {
		System.setOut(originalOut);
	}

	/**
	 * Test method for sequence range from positive number to a positive number
	 * 
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqRangePositiveToPositive() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();
		fizzBuzzInput.setStartOfRange(1);
		fizzBuzzInput.setEndOfRange(10);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "Fizz");
		map.put(5, "Buzz");
		fizzBuzzInput.setMap(map);
		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);
		StringBuilder fizzBuzzOutput = new StringBuilder();
		fizzBuzzOutput.setLength(0);
		fizzBuzzOutput.append("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n");
		assertEquals(fizzBuzzOutput.toString(), outContent.toString());

	}

	/**
	 * Test method for sequence range from negative number to a positive number
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqRangeNegativeToPositive() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();
		fizzBuzzInput.setStartOfRange(-10);
		fizzBuzzInput.setEndOfRange(2);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "Fizz");
		map.put(5, "Buzz");
		fizzBuzzInput.setMap(map);
		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);
		StringBuilder fizzBuzzOutput = new StringBuilder();
		fizzBuzzOutput.setLength(0);
		fizzBuzzOutput.append("Buzz\nFizz\n-8\n-7\nFizz\nBuzz\n-4\nFizz\n-2\n-1\nFizzBuzz\n1\n2\n");
		assertEquals(fizzBuzzOutput.toString(), outContent.toString());

	}
	/**
	 * Test method for sequence range from negative number to a negative number
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqRangeNegativeToNegative() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();
		fizzBuzzInput.setStartOfRange(-20);
		fizzBuzzInput.setEndOfRange(-10);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2, "Fizz");
		map.put(4, "Buzz");
		fizzBuzzInput.setMap(map);
		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);
		StringBuilder fizzBuzzOutput = new StringBuilder();
		fizzBuzzOutput.setLength(0);
		fizzBuzzOutput.append("FizzBuzz\n-19\nFizz\n-17\nFizzBuzz\n-15\nFizz\n-13\nFizzBuzz\n-11\nFizz\n");
		assertEquals(fizzBuzzOutput.toString(), outContent.toString());

	}

	/**
	 * Test method for sequence range from zero to a positive number
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqRangeZeroToPositive() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();
		fizzBuzzInput.setStartOfRange(0);
		fizzBuzzInput.setEndOfRange(15);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(4, "Frog");
		map.put(13, "Duck");
		map.put(9, "Chicken");
		fizzBuzzInput.setMap(map);
		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);
		StringBuilder fizzBuzzOutput = new StringBuilder();
		fizzBuzzOutput.setLength(0);
		fizzBuzzOutput.append("FrogChickenDuck\n1\n2\n3\nFrog\n5\n6\n7\nFrog\nChicken\n10\n11\nFrog\nDuck\n14\n15\n");
		assertEquals(fizzBuzzOutput.toString(), outContent.toString());

	}

	/**
	 * Test method for sequence range from a number to itself
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqRangeMinLength() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();
		fizzBuzzInput.setStartOfRange(1);
		fizzBuzzInput.setEndOfRange(1);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Frog");
		fizzBuzzInput.setMap(map);
		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);
		StringBuilder fizzBuzzOutput = new StringBuilder();
		fizzBuzzOutput.setLength(0);
		fizzBuzzOutput.append("Frog\n");
		assertEquals(fizzBuzzOutput.toString(), outContent.toString());

	}

	/**
	 * Test method for empty input
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqEmptyInput() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();

		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);

		assertEquals("0\n", outContent.toString());

	}

	/**
	 * Test method for empty divisor token pairs
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test
	public void testPrntSeqEmptyTokens() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();

		fizzBuzzInput.setStartOfRange(1);
		fizzBuzzInput.setEndOfRange(10);

		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);
		StringBuilder fizzBuzzOutput = new StringBuilder();
		fizzBuzzOutput.setLength(0);
		fizzBuzzOutput.append("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n");
		assertEquals(fizzBuzzOutput.toString(), outContent.toString());

	}

	/**
	 * Test method for zero as a divisor
	 * {@link action.SuperFizzBuzz#printSequence(models.FizzBuzzInput)}.
	 */
	@Test(expected = ArithmeticException.class)
	public void testPrintSequenceZeroAsDivisor() {
		FizzBuzzInput fizzBuzzInput = new FizzBuzzInput();
		fizzBuzzInput.setStartOfRange(-10);
		fizzBuzzInput.setEndOfRange(2);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(0, "Fizz");
		map.put(5, "Buzz");
		fizzBuzzInput.setMap(map);
		SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz();
		superFizzBuzz.printSequence(fizzBuzzInput);

	}

}
