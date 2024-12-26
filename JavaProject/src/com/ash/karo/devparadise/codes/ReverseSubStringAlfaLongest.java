package com.ash.karo.devparadise.codes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Finding longest alphabetically reversed substring  
 * 
 * Input: xzgBBBBBBBAvJACBMOneAAA
 * 
 * Substrings = gBBBBBBBA 
 * Substrings = JA 
 * Substrings = OneAAA
 * 
 * Output: gBBBBBBBA
 * 
 * 
 * Input: xzgBAvJACBMOneAAA
 * 
 * Substrings = gBA
 * Substrings = JA
 * Substrings = OneAAA
 * 
 * Output: OneAAA
 * 
*/public class ReverseSubStringAlfaLongest {

	public static void main(String[] args) {
		reverseSubStringAlfaLongest("xzgBAvJACBMOneAAA");
	}

	private static void reverseSubStringAlfaLongest(String s) {
		// System.out.println(s.substring(1));
		StringBuilder str = new StringBuilder();
		List<String> result = new ArrayList<String>();
		//System.out.println(str.charAt(str.length()-1));
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			//System.out.println("charAt = "+ch);

			//initially if substring is empty add value to substring
			//on next iterations compare the last character value of substring(added in last iteration) with current character value
			//to find the reverse alfabet sequence
			if(str.length() == 0 || Character.toLowerCase(str.charAt(str.length()-1)) >= Character.toLowerCase(ch)) { 
				str.append(ch);
				
				// Condition for Last element to be multiple A's in the Input string
				// where Input string length is equal to iterator i.e. last value of i to be equal  
				if(i == s.length()-1) {
					result.add(str.toString());
				}
				
				System.out.println("Builder = "+str);
			} else {
				// Add the substring to the list and reset the StringBuilder
				// We added if condition on line 51 as if last character of the iteration is repeating then it will 
				// go inside the If condition at 46 and else will not run thus last found substring would be missed.
				if(str.length()>1 && i < s.length()) {
					result.add(str.toString());
				}
				str = new StringBuilder();
			}
		}
		System.out.println();
		result.stream().forEach(x->System.out.println("Substrings = "+x));
		
		//result.stream().map(a->{a.length();}).max();
		System.out.println();
		System.out.println(result.stream().max(Comparator.comparing(String::length)).get());

	}

}
