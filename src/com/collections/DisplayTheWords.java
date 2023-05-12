/**
 * 
 */
package com.collections;

/**
 * using of lamba functions in interface
 * @author Madhumitha
 *Date:05/05/2023
 */ 
@FunctionalInterface
interface Message{
	public abstract int add(int a,int b);
}
public class DisplayTheWords {
	public static void main(String[] args) {
		 Message m=(a,b)->(a+b);
		 System.out.println(m.add(5,6));
	}
}
