package com.exception;

import java.util.Scanner;
class InvalidUserName extends Exception{
	public InvalidUserName(String s) {
		super(s);
	}
}
public class UserName {
	public static void InvalidUserName (String name) throws InvalidUserName{
		    char []s=name.toCharArray();
		    int l=0;
		    int u=0;
		    for(int i=0;i<name.length();i++) {
		    	if(Character.isLowerCase(s[i]))
		    		l++;
		    	else if(Character.isUpperCase(s[i]) )
		    		u++;
		 
				}
		   
		    if(name.length()>=8 && name.contains("_")==true &&l>0 && u>0)  {
	    		System.out.println("valid user Name");
	    	
		    }
		    else {
		    		System.out.println("Invalid UserName");
		    	     
		}
		    
	}


	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
        String name=read.nextLine();
        try {
        	InvalidUserName(name);
        }
        catch(InvalidUserName e) {
        	System.out.println(e);
        }
        read.close();
	}

}
