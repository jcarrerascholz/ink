package com.inkglobal.com;

/**
 * @author jcarrera This class converts Numbers to it's equivalent in words
 * 
 */
public class NumberToUKWordConverter {

	final private static String[] tensWords = { "", "", "Twenty", "Thirty",
			"Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	final private static String[] unitsWords = { "Zero", "One", "Two", "Three",
			"Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
			"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };

	public static String convert(int i) {
		if (i < 0)
			return "Negative numbers not supported.";
		if (i < 20)
			return unitsWords[i];
		if (i < 100)
			return tensWords[i / 10]
					+ ((i % 10 > 0) ? " " + convert(i % 10) : "");
		if (i < 1000)
			return unitsWords[i / 100] + " Hundred"
					+ ((i % 100 > 0) ? " And " + convert(i % 100) : "");
		if (i < 1000000)
			return convert(i / 1000) + " Thousand"
					+ ((i % 1000 > 0) ? " " + convert(i % 1000) : "");
		return convert(i / 1000000) + " Million"
				+ ((i % 1000000 > 0) ? " " + convert(i % 1000000) : "");
	}
}
