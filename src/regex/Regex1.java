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


// Some general patterns case : 
// [abc] -> a,b or c
// [^abc] -> Any character except a,b and c
// [a-z] -> a to z
// [A-Z] -> A to Z
// [a-zA-z] -> a to z, A to Z
// [0-9] -> 0 to 9

// Quantifiers :
// [ ]? -> Occurs 0 or 1 time
// [ ]+ -> Occurs 1 or more times
// [ ]* -> Occurs 0 or more times
// [ ]{n} -> Occurs n times
// [ ]{n, } -> Occurs n times atleast
// [ ]{y, z} -> Occurs atleast y times, but less than z times

// Regex MetaCharacters  \ -> Tells computer to treat following characters as search character for  '+', '.'
// \d [0-9]
// \D [^0-9]
// \w [a-zA-Z_0-9]
// \W [^\w]

// Examples :- 
// 1. Mobile number start with 8 or 9 , Total digits 10 -> [8 9][0-9]{9}
// 2.First char Uppercase, contains lower case alphabets, only one digit allowed in between
// -> [A-Z][a-z]*[0-9][a-z]*
// Email ID -> [a-z0-9_\-\.]+[@]+[a-z]+[\.]+[a-z]{2,3}


public class Regex1 {

	public static void main(String[] args) {
		
		String regex = "a*b*"; // * zero or more
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("aaabbbbb");
		boolean matches = m.matches();
		
		System.out.println("result: " + matches);
	}

}
