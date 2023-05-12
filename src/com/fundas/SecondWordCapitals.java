/**
 * 
 */
package com.fundas;

/**
 * program for printing the second word in uppercase in a string
 * @author Madhumitha
 * Date:15/03/2023
 */
import java.util.*;
public class SecondWordCapitals {
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
        String name=read.nextLine();
        //splitting the strings
        String splited[]=name.split(" ");
        //checking string has more than a two words
        if(splited.length<2)
        	System.out.println("LESS");
        else
          System.out.println(splited[1].toUpperCase());
	}
}
