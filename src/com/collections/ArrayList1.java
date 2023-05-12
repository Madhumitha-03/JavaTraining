/**
 * 
 */
package com.collections;

/**
 * @author mnatarajan
 *
 */

import java.util.*;
public class ArrayList1 {

	
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(3);
		arr.add(67);
		arr.add(77);
		System.out.println(arr);

		arr.add(2,89);
		System.out.println(arr);
		
		int a[]=new int[] {1,2,3,4,5};
		List <Integer>arrayList1=new ArrayList();
		arrayList1.add(2);
		arrayList1.add(4);
	
		arr.addAll(1,arrayList1);
		System.out.println(arr);
		
		arr.remove(0);
		arr.add(89);
		System.out.println(arr);
		System.out.println(arr.size());
		
		if(arr.contains(77))
			System.out.println("Seven Seven");
		else
			System.out.println("No");
		
		if(arr.containsAll(arrayList1))
			System.out.println("It is there");
		else
			System.out.println("there is no that collection");
		
		System.out.println(arr.get(5));
		System.out.println(arr.lastIndexOf(89));
		arr.set(1, 33);
		System.out.println(arr);
		System.out.println(arrayList1);
		System.out.println(arr.retainAll(arrayList1));
		System.out.println(arr);
		arr.add(1);
		arr.add(3);
		arr.add(67);
		arr.add(77);
		
		System.out.println(arr);
		//for each
		for(Integer value:arr) {
			System.out.println(value);
		}
		System.out.println();
		//iterator
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		List <Integer>l=arr.subList(3,5);
		System.out.println(l);
		
		//Collections.reverse(arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		Collections.shuffle(arr);
		System.out.println(arr);
		
		//arraylist for strings
		ArrayList<String> str=new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println("arraylist for strings:"+str);
		
		//arraylist for double
		ArrayList<Double> db=new ArrayList<Double>();
		db.add(1.2);
		db.add(2.3);
		db.add(4.5);
		System.out.println("arraylist for double:"+db);
		
	}

}
