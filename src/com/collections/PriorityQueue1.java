/**
 * 
 */
package com.collections;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(4);
		pq.add(2);
		pq.add(5);
		pq.add(6);
		pq.add(3);
		Iterator<Integer>itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		pq.remove(4);
		Iterator<Integer>itr1=pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println();
		pq.poll();
		Iterator<Integer>itr2=pq.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
