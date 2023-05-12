/**
 * 
 */
package com.collections;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String,Double>hp=new HashMap<String,Double>();
		System.out.println("Size:"+hp.size());
		hp.put("aaa",1.0);
		hp.put("bbbb", 2.8);
		hp.put("ccc",3.4);
		hp.put("dddd", 5.6);
		System.out.println(hp);
		Set<Map.Entry<String,Double>>ss=hp.entrySet();
		
		System.out.println(ss);
		for(Map.Entry<String,Double >mp:ss) {
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		hp.remove("aaa");
		hp.remove("dddd",5.6);
		System.out.println(hp);
		
		Scanner read =new Scanner(System.in);
		String name=read.nextLine();
		double id =read.nextInt();
		hp.put(name, id);
		System.out.println(hp);
		
		if(hp.containsKey("hhh")==true) {
			System.out.println("true");
		}
		

	}

}
