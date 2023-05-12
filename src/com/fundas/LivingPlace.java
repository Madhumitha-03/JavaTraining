/**
 * 
 */
package com.fundas;

/**
 * checking living area of the person
 * @author Madhumitha
 * Date:02/05/2023
 */
import java.util.*;
public class LivingPlace {
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		
		System.out.println("Enter Gender:");
		String gender=read.nextLine();
		System.out.println("Enter Age:");
		int age=read.nextInt();
		
		if(gender.equals("F")&& (age>0)) {
			System.out.println("Urban Area");
		}
		else if(gender.equals("M")&&(age >=20 &&age<=40)) {
			System.out.println("AnyWhere");
		}
		else if(gender.equals("M")&&(age >40 &&age<=60)) {
			System.out.println("Urban Areas");
		}
		else
			System.out.println("Invalid Age");
		
	}

}
