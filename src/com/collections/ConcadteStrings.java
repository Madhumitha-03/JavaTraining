/**
 * 
 */
package com.collections;

import java.util.ArrayList;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
public class ConcadteStrings {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Enter no.of string");
		int n=read.nextInt();
		
		// Create a HashSet of strings
	    HashSet<String> hs = new HashSet();
	    System.out.println("Enter the strings");
	    for(int i=0;i<n;i++) {
			hs.add(read.next());
		}
	    // Using iterator to print the elements in set
	    System.out.println("Elements in set:");
	    Iterator<String> itr = hs.iterator();
	     while (itr.hasNext()) {
	         String element = itr.next();
	         System.out.println(element);
	     }
 
	     // Concatenate the strings in the set
	     String concateString = "";
	     for (String s : hs) {
	           concateString = concateString + " " + s;
	      }
	      System.out.println("Concatenated string: " + concateString);
	      read.close();
	 }
}

