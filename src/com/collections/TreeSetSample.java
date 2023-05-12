/**
 * 
 */
package com.collections;

/**
 * 
 * @author mnatarajan
 *
 */
import java.util.*;
public class TreeSetSample {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(3);
		ts.add(9);
		ts.add(4);
		TreeSet<Integer>res= (TreeSet<Integer>)ts.descendingSet();
		for(Integer value:res) {
			System.out.println(value);
		}
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
		System.out.println("Size:"+ts.size());
		for(Integer value:ts) {
			if(value<7) {
				System.out.println(value);
			}
			
			
			else
				System.out.println("Number is greater than 7");
			
		}
		

	}

}
