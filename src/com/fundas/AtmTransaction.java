package com.fundas;


/**
 * Program for ATM money is multiples of 500
 * @author Madhumitha
 * Date:02/05/2023
 */
import java.util.*;
public class AtmTransaction {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amount=read.nextInt();
		if(amount%500==0)
			System.out.println("Valid amount transaction in progress");
		else
			System.out.println("Please enter amount multiple of 500");
		read.close();
	}

}
