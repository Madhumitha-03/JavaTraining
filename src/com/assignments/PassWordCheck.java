package com.assignments;

import java.util.*;
public class PassWordCheck {
     public static void main(String[]args) {
    	 Scanner read=new Scanner(System.in);
    	 String name=read.nextLine();
    	 char []s=name.toCharArray();
		    int l=0;
		    int u=0;
		    int d=0;
		    int sp=0;
		    for(int i=0;i<name.length();i++) {
		    	if(Character.isLowerCase(s[i]))
		    		l++;
		    	else if(Character.isUpperCase(s[i]) )
		    		u++;
		    	else if(Character.isDigit(s[i])) {
		    		d++;
		    	}
		    	else
		    		sp++;
		 
				}
		   
		    if(name.length()>=8 &&l>0 && u>0 && sp>0 &&d>0)  {
	    		System.out.println("valid user Name");
	    	
		    }
		    else {
		    		System.out.println("Invalid UserName");
		    	     
		}
    	 
     }

	
}
