package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// A group of string objects according to a particular pattern
// eg: 1. validations

// Regex is a powerful tool in Java for defining patterns that can be used for searching,
// manipulating, and editing strings.

// java.util.regex package defined classes to work with regex in java.
// Pattern Class- Represent Compile version of regex
// Matcher Class- Represent regex engine perform maches

// Use of Regex
// 1.Validating user input (e.g., email addresses, passwords).
// 2.Extracting specific information from text (e.g., phone numbers, dates).
// 3.Searching and replacing text based on patterns.

public class Regex1 {

	public static void main(String[] args) {
		
		String regex = "a*b*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("aaabbbbb");
		boolean matches = m.matches();
		
		System.out.println("result: " + matches);
	}

}
