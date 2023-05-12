
package com.collections;

import java.util.*;
/**
* Sort names given by user which has letters greater than 5
* @author jsureshk
* date : 10/05/2023
*/
public class NameSorting {
public static void main(String[] args) { 
	Scanner scan=new Scanner(System.in);
	System.out.println("How many names:");
	int n=scan.nextInt();
	ArrayList<String> al=new ArrayList<String>();
	
    System.out.println("Entr Names:");
	for(int i=0;i<n;i++) {
		al.add(scan.next());
}
	System.out.println(&quot;Names with letters greater than5&quot;);
	for(String i:al) {
		if(i.length()&gt;5)
			System.out.println(i);

}
scan.close();
}
}
