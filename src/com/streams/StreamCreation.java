/**
 * 
 */
package com.streams;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
import java.util.stream.Stream;
public class StreamCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer [] numbers=new Integer[] {4,2,6,1,7,3,3,9};
		//count the numbers
		int count=(int) Arrays.stream(numbers).distinct().count();
	    System.out.println("count="+count);
	    System.out.println();
	                          
	    //printing array
	    Stream<Integer> streamOfArray=Stream.of(numbers);
	    streamOfArray.forEach(s ->System.out.println(s+"\t"));
	    System.out.println();
        
	    //collection stream
	    Collection<String> collection=Arrays.asList("ab","cd","ef");
	    Stream<String> streamOfCollection=collection.stream();
	    streamOfCollection.forEach(s ->System.out.println(s+"\t"));
	    System.out.println();
        
	    //Infinite Stream
	    Stream<String> sg=Stream.generate(()->"times").limit(3);
	    sg.forEach(s->System.out.println(s+"\t"));
	    System.out.println();
	    
	    Stream<Integer> si=Stream.iterate(10,n->n+2).limit(5);
	    si.forEach(s ->System.out.println(s+"\t"));
        
	}

}
