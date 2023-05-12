/**
 * 
 */
package com.collections;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
public class MarksAndStudentName {
	public static void main(String[] args) {
		HashMap<String,Integer>hp=new HashMap<String,Integer>();
		Scanner read=new Scanner(System.in);
		String j;
		int h;
		for(int i=0;i<6;i++) { //getting inputs
			 j=read.next();
			 h=read.nextInt();
			hp.put(j,h);
		}
        Stack<String>sk=new Stack<String>();
		Set<Map.Entry<String, Integer>>ss=hp.entrySet();
		for(Map.Entry<String, Integer>mp:ss) {// marks are more than 75
			if(mp.getValue() >75) {
				sk.push(mp.getKey());
			}
			while(!(sk.empty())) {
				System.out.println(sk.pop());
			}
				

			
		}

	}

}
