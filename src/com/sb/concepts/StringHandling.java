package com.sb.concepts;

public class StringHandling {
	public static void main(String[] args) {
		/*
		 * String declaration
		 * String concatenation
		 * String length
		 * String comparison
		 * String hashcode
		 * Null & Empty check
		 * Index
		 * Substring
		 * Replace
		 * Split
		 * Why string is immutable in Java?
		 * 
		 */
		String s = "";
		String s1 = new String();
		String s2 = null;
		System.out.println(s.hashCode() + ";" + s1.hashCode());
		//System.out.println(s2.hashCode());
		String s3 = s.hashCode() + ";" + s1.hashCode();
		// if (s1 == "" && s1.equals(""))
		// if ( s1 == null)
		System.out.println("Length of s3: " + s3.length());
		String c1 = "sarath";
		String c2 = "sarath";
		String c3 = "Sarath";
		System.out.println(c1.hashCode() + " && " + c2.hashCode() + " = " + (c1 == c2));
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c3);
		System.out.println(c1.equals(c3));
		System.out.println(c1.equalsIgnoreCase(c3));
	}
}
