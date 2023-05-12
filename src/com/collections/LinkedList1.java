/**
 * 
 */
package com.collections;

/**
 * creating linkedlist for different data types
 * @author mnatarajan
 *10/05/2023
 */
import java.util.*;
public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String>arr=new LinkedList();
		arr.add("M");
		arr.add("a");
		arr.add("d");
		arr.add("h");
		arr.add("u");
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		List <String>l=arr.subList(0, 3);
		Iterator<String> itr1=l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	
	    //remove element in linkedlist	
		arr.remove(0);
	
		System.out.println(arr);
		System.out.println(arr.size());
		
		if(arr.contains(77))
			System.out.println("Seven Seven");
		else
			System.out.println("No");
		
		
		System.out.println(arr.get(1));
		System.out.println(arr.lastIndexOf(89));
		
		//arraylist for strings
		LinkedList<Integer> str=new LinkedList<Integer>();
		str.add(67);
		str.add(78);
		str.add(98);
		System.out.println("LinkedList for Integer:"+str);
				
		//arraylist for double
		LinkedList<Double> db=new LinkedList<Double>();
		db.add(1.2);
		db.add(2.3);
		db.add(4.5);
		System.out.println("Linkedlist for double:"+db);
	   /* Stack<String>st=new Stack();
	    st.push("M");
		st.push("a");
		st.push("d");
		st.push("h");
		st.push("u");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
      
        
        HashSet<String>hs=new HashSet();
        System.out.println("size="+hs.size());
        hs.add("M");
		hs.add("a");
		hs.add("d");
		hs.add("h");
		hs.add("u");
		System.out.println(hs);
		hs.add("a");
		hs.remove("h");
		System.out.println(hs);
		System.out.println("size="+hs.size());
		
		LinkedHashSet<Integer>lhs=new LinkedHashSet();
		lhs.add(5);
		lhs.add(2);
		lhs.add(4);
		lhs.add(2);
		lhs.removeIf((n)->(n%2)==0);
		System.out.println(lhs);
		
		TreeSet<Integer>ts=new TreeSet();
		ts.add(5);
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(9);
		ts.remove(5);
		System.out.println(ts);*/
         
	}

}
