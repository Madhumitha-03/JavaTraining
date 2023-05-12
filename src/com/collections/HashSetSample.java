/**
 * 
 */
package com.collections;

import java.util.*;

/**
 * @author mnatarajan
 *
 */
class EmployeDetails implements Comparable<EmployeDetails>{
	private int id;
	private String name;
	

	public EmployeDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return ("Employee[empid="+id+" empname="+name+"]");
	}

	@Override
	public int compareTo(EmployeDetails o) {
		return(name.compareTo(o.name));
	
	}
}
public class HashSetSample {
	public static void main (String[] args) {
		Scanner read =new Scanner(System.in);
		 PriorityQueue<String>hs=new PriorityQueue();
	        System.out.println("size="+hs.size());
	        hs.add("M");
			hs.add("a");
			hs.add("d");
			hs.add("h");
			hs.add("u");
			System.out.println("Priority Queue for strings:"+hs);
			System.out.println("Enter element to insert:");
			hs.add(read.nextLine());
			System.out.println("Enter element to remove:");
			hs.remove(read.nextLine());
			System.out.println("after removing:"+hs);
			System.out.println("size="+hs.size());
			//for double
			PriorityQueue<Double>db=new PriorityQueue();
			System.out.println("enter the no.double elements");
			int n=read.nextInt();
			for(int i=0;i<n;i++) {
				db.add(read.nextDouble());
			}
			System.out.println(db);
			System.out.println("Enter element to verify:");
			if(db.contains(read.nextDouble()))
				System.out.println("it have that elemnet");
			else
				System.out.println("It do not have that element");
			
			//for integer
			PriorityQueue<Integer>hs1=new PriorityQueue();
			System.out.println("enter the no.of.Integer elements");
			int n1=read.nextInt();
			for(int i=0;i<n1;i++) {
				hs1.add(read.nextInt());
			}
			System.out.println(hs1);
			
			//for cutomised datas
			PriorityQueue<EmployeDetails>emp=new PriorityQueue();
			System.out.println("enter the no.name and id");
			int n2=read.nextInt();
			System.out.println("enter the  id and name");
			for(int i=0;i<n2;i++) {
				emp.add(new EmployeDetails(read.nextInt(),read.nextLine()));
			}
			System.out.println(emp);

	}

}
