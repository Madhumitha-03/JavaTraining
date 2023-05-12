
package com.collections;

/**
 * program for push and pop functions
 * @author Madhumitha
 * Date:10/05/2023
 */
import java.util.*;
public class JulieProblem {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		HashMap <String , Double> hp = new HashMap<String,  Double>();
		Stack<String> sk = new Stack<String>();
		System.out.println("enter 6 members name and mark");
		for(int i=0;i<6;i++) {
			hp.put(read.next(), read.nextDouble());
		}
		Set<Map.Entry<String, Double>> set = hp.entrySet();
		for(Map.Entry<String , Double> me : set) {
			if(me.getValue() > 75)
				sk.push(me.getKey());
		}
		while(!(sk.isEmpty())) {
			System.out.println(sk.pop());
		}
	}

}
