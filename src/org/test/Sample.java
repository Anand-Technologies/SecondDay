
package org.test;

public class Sample {

	public static void main(String[] args) {

		String s = "Nishanthi";
		String s1 = "nishanthi";

		// compare two string with case
		boolean b = s.equals(s1);
		System.out.println(b);

		// compare two string without case
		boolean b1 = s.equalsIgnoreCase(s1);
		System.out.println(b1);
		
		//change one letter into another letter
		String re = s.replace('i', '*');
		System.out.println(re);
		
		//to check whether string is Empty or not
		String s3="";
		
		boolean c = s3.isEmpty();
		System.out.println(c);
	
		//to join two string
		String h="renganathan";
		
		String co = s.concat(h);
		System.out.println(co);
		
	//to remove unwanted space
		String l="   nisha    rengan   ";
		System.out.println(l);
	
		String tr = l.trim();
		System.out.println(tr);
		
	//to check whether string contains	particular or not
		boolean d = s.contains("atn");
		System.out.println(d);
		
		
		
		
		
		
		
		
		
	}
}