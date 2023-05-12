/**
 * 
 */
package com.fundas;

/**
 * program for finding number of occurance in a given array
 * @author Madhumitha
 * Date:02/05/2023
 */
import java.util.*;
public class SearchAndCount {

	
	public static void main(String[] args) {
		int array[]=new int[25];
		Scanner read=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("Enter Searching Number:");
		int number =read.nextInt();
		int count=0;
        for(int i=0;i<array.length;i++) {
        	if(number==array[i])
        		count++;
        }
        System.out.println("the number "+number+ " is present="+count);
        read.close();
	}

}
