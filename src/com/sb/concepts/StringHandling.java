package com.sb.concepts;

public class StringHandling {
	public static void main(String[] args) {
		/*
		 * String declaration - C
		 * String concatenation - C
		 * String length - C
		 * String comparison - C
		 * String hashcode - C
		 * Null & Empty check - C
		 * Index - C
		 * Substring - C
		 * Replace - C
		 * Split - C
		 * Why string is immutable in Java? - C
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
		
		String k1 = "sarath";
		String k2 = new String("sarath");
		System.out.println(k1.hashCode() + " && " + k2.hashCode() + " = " + (k1 == k2) + ", " + k1.equals(k2));
		
		System.out.println("--------Index--------");
		String i1 = "Chaitanya is learning java";
		System.out.println("Index of y: " + i1.indexOf("a", 16));
		
		System.out.println("--------Sub-string--------");
		System.out.println(i1.substring(10));
		System.out.println(i1.substring(13,21));
		
		System.out.println("--------Split--------");
		String j1 = "IN,India";
		String[] j1Array = j1.split(","); 
		// Handson - find the usage of String.split(regex, limit)
		String country_code = j1Array[0];
		String country_name = j1Array[1];
		System.out.println(j1Array[0] + "::" + j1Array[1]);
		System.out.println("Country code: " + country_code);
		System.out.println("Country name: " + country_name);
		
		System.out.println("--------Replace--------");
		String r1 = "Chaitanya is living in India";
		System.out.println(r1.replace("I", "U"));
		System.out.println(r1.replace("India", "US"));
		System.out.println(r1.replaceAll("a", "A"));
		System.out.println(r1.replaceFirst("a", "A"));
		// Write a method replaceLast to replace last occurrence of a char/str
		
		System.out.println("---Immutability---");
		String l1 = "chaitanya";
		String l2 = l1 + " is staying in US";
		l1 = l1 + " cherukuri"; // l1 will now have new memory location
		
	}
}
