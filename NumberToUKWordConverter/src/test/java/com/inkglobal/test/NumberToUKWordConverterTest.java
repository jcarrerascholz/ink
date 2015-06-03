package com.inkglobal.test;

import junit.framework.TestCase;

import com.inkglobal.com.NumberToUKWordConverter;

/**
 * @author jcarrera This class tests NumberToUKWordConverter.class
 *
 */
public class NumberToUKWordConverterTest extends TestCase {

	public void testConversionForMinimumSupportedNumber() {
		String result = NumberToUKWordConverter.convert(0);
		assertEquals("Zero", result);
	}

	public void testConversionOfUnitsNumber() {
		String result = NumberToUKWordConverter.convert(3);
		assertEquals("Three", result);
	}

	public void testConversionOfTenNumber() {
		String result = NumberToUKWordConverter.convert(10);
		assertEquals("Ten", result);
	}

	public void testConversionOfNumberLessThanTwenty() {
		String result = NumberToUKWordConverter.convert(16);
		assertEquals("Sixteen", result);
	}

	public void testConversionOfHundredNumber() {
		String result = NumberToUKWordConverter.convert(100);
		assertEquals("One Hundred", result);
	}

	public void testConversionOfNumberLessThanThousand() {
		String result = NumberToUKWordConverter.convert(524);
		assertEquals("Five Hundred And Twenty Four", result);
	}

	public void testConversionOfThousandsNumber() {
		String result = NumberToUKWordConverter.convert(1000);
		assertEquals("One Thousand", result);
	}

	public void testConversionOfTenThousandsNumber() {
		String result = NumberToUKWordConverter.convert(10000);
		assertEquals("Ten Thousand", result);
	}

	public void testConversionOfNumberLessThanTenThousand() {
		String result = NumberToUKWordConverter.convert(1942);
		assertEquals("One Thousand Nine Hundred And Forty Two", result);
	}

	public void testConversionOfHundredThousandsNumber() {
		String result = NumberToUKWordConverter.convert(100000);
		assertEquals("One Hundred Thousand", result);
	}

	public void testConversionOfNumberLessThanHundredThousand() {
		String result = NumberToUKWordConverter.convert(12600);
		assertEquals("Twelve Thousand Six Hundred", result);
	}

	public void testConversionOfLessThanMillionNumber() {
		String result = NumberToUKWordConverter.convert(332517);
		assertEquals(
				"Three Hundred And Thirty Two Thousand Five Hundred And Seventeen",
				result);
	}

	public void testConversionOfMillionNumber() {
		String result = NumberToUKWordConverter.convert(1000000);
		assertEquals("One Million", result);
	}

	public void testConversionOfLessThanTenMillionNumber() {
		String result = NumberToUKWordConverter.convert(4800481);
		assertEquals(
				"Four Million Eight Hundred Thousand Four Hundred And Eighty One",
				result);
	}

	public void testConversionOfTenMillionNumber() {
		String result = NumberToUKWordConverter.convert(10000000);
		assertEquals("Ten Million", result);
	}

	public void testConversionOfLessThanHundredMillionNumber() {
		String result = NumberToUKWordConverter.convert(12902455);
		assertEquals(
				"Twelve Million Nine Hundred And Two Thousand Four Hundred And Fifty Five",
				result);
	}

	public void testConversionOfHundredMillionNumber() {
		String result = NumberToUKWordConverter.convert(100000000);
		assertEquals("One Hundred Million", result);
	}

	public void testConversionOfLessThanBillionNumber() {
		String result = NumberToUKWordConverter.convert(501608927);
		assertEquals(
				"Five Hundred And One Million Six Hundred And Eight Thousand Nine Hundred And Twenty Seven",
				result);
	}

	public void testConversionForMaximumSupportedNumber() {
		String result = NumberToUKWordConverter.convert(999999999);
		assertEquals(
				"Nine Hundred And Ninety Nine Million Nine Hundred And Ninety Nine Thousand Nine Hundred And Ninety Nine",
				result);
	}

	public void testConversionForNegativeNumber() {
		String result = NumberToUKWordConverter.convert(-10);
		assertEquals("Negative numbers not supported.", result);
	}
}