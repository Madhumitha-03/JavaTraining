/**
 * 
 */
package com.fundas;

/**
 * program for adding 2 in each digit
 * @author mnatarajan
 * Date:02/05/2023
 */
import java.util.*;
public class FourDigitNumber {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("Enter 4 digit NUmber=");
		int number=read.nextInt();
		int res=0;
		int pow=0;
		while(number!=0) {
			int n=number%10;
			number=number/10;
			n=(n+2)%10;
			res=(int)(res+(n*Math.pow(10,pow)));
			pow++;	
		}
		System.out.println(res);
        read.close();
        
	}

}
