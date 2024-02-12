package advanced_java;
import java.util.regex.*;
public class RegularExpression_demo {

	public static void main(String[] args) {
		/*
		 * //1 way
		 * 
		 * Pattern p = Pattern.compile(". . a"); Matcher m = p.matcher("sla"); boolean
		 * o1 = m.matches(); System.out.println(o1); System.out.println(m.start()); // 2
		 * way
		 * 
		 * boolean o2 = Pattern.compile(".. a").matcher("sla").matches() ;
		 * System.out.println(o2); // 3 way
		 */
		  //System.out.println(Pattern.matches(". . a", "sla"));
		// Quantifiers in java
		// ? - once or not
		// + - one or more
		// * - zero or more
		// Meta characters and meta tags
		// \d - digits (0 -9)
		// \D - except digits
		// \w - Alphanumeric words (a-z, A-Z, 0-9, _)
		// \W - except alphanumeric (symbols only)
		// \s - white spaces
		// \S - except white spaces
		// [abc] ---> either a or b or c
		// [^abc] ---> except either a or b or c
		// [0-9] {6} --> only numbers and six digit numbers 
		//[0-9] {6,} --> only numbers and six digit numbers or more
        //[0-9] {6,10} --> only numbers and minimum six but less than ten
		
	    System.out.println("list of Quantifiers");
		System.out.println(Pattern.matches(". . a", "sla"));
		System.out.println(Pattern.matches("a", "sla"));
		System.out.println(Pattern.matches("a", "a"));
		System.out.println(Pattern.matches("a?", "sla"));
		System.out.println(Pattern.matches("[abc]", "sla"));
		System.out.println(Pattern.matches("[s]", "sla"));
		System.out.println(Pattern.matches("[abc]", "c"));
		System.out.println(Pattern.matches("[Ss]", "sla"));
		System.out.println(Pattern.matches("[Ss]la", "sla"));
		System.out.println(Pattern.matches("[Ss]la", "Sla"));
		System.out.println(Pattern.matches("[Ss]la", "SLA"));
		System.out.println(Pattern.matches("[^Ss]", "sla"));
		System.out.println(Pattern.matches("[^Ss]la", "tla"));
		System.out.println(Pattern.matches("^rk$", "rajesh"));
		System.out.println(Pattern.matches("^rk$", "jasonrk"));
		System.out.println(Pattern.matches("^rk$", "rkjason"));
		System.out.println(Pattern.matches("^rk$", "rk"));
		System.out.println(Pattern.matches("[rk]*", "i am rk"));
		System.out.println(Pattern.matches("....rk", "i am rk"));
		System.out.println(Pattern.matches("[0-9]+", "1213"));
		System.out.println(Pattern.matches("[0-9]*", "1213"));
		System.out.println(Pattern.matches("[0-9]{4}", "1213"));
		System.out.println(Pattern.matches("[0-9]{5}", "1213"));
		System.out.println(Pattern.matches("[0-9]{5,}", "1213"));
		System.out.println(Pattern.matches("[0-9]{5,}", "12130"));
		System.out.println(Pattern.matches("[0-9]{6,}", "12138990"));
		System.out.println(Pattern.matches("[0-9]{5}", "1213"));
		System.out.println("------");
		System.out.println(Pattern.matches("[a-z][0-9]{6,}", "rk121378"));
		System.out.println(Pattern.matches("[a-z]+[0-9]+{6,}", "rk1213897"));
		System.out.println(Pattern.matches("[789] {3} [0-9]+{6,}", "9384419609"));
		System.out.println(Pattern.matches("[789] {3} [0-9]+{6,}", "6384419609"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "7894419609"));
		
	}

}
