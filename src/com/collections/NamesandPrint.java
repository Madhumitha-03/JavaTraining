/**
 * 
 */
package com.collections;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
public class NamesandPrint {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter number of names:");
		int n=read.nextInt();
		//String j;
		System.out.println("Enter Names:");
		for(int i=0;i<n;i++) {
			String j=read.next();
			al.add(j);	 
		}
		for(String name:al) {
			if(name.length()>5)
				System.out.println(name);
		}
		}

}
