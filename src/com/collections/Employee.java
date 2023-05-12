/**
 * 
 */
package com.collections;

/**
 * @author mnatarajan
 *
 */
import java.util.*;
public class Employee  {
	private int id;
	private String name;
	
	public Employee(){
		
	}

	public Employee(int id, String name) {
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
	public int compareTo(Employee o) {
		if(id==o.id)
			return 0;
		else if(id>o.id)
			return 1;
		else 
			return -1;
	}

	

	public static void main(String[] args) {
		Employee emp=new Employee();
		Scanner read=new Scanner(System.in);
		//arraylist
		/*ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(new Employee(1,"asdf"));
		arr.add(new Employee(2,"mnbv"));
		//System.out.println(arr);
		Iterator<Employee> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		//linked list
		LinkedList<Employee> ar1=new LinkedList<Employee>();
		
		for(int i=0;i<3;i++) {
			int id=read.nextInt();
			String name=read.nextLine();
			ar1.add(new Employee(id,name));
		}
		Iterator<Employee> itr1=ar1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//stack
		/*Stack<Employee>sk=new Stack();
		sk.push(new Employee(12,"madhu"));
		System.out.println(sk);*/
	    //linkedhashlist
		/*LinkedHashSet<Employee>lhs=new LinkedHashSet();
		lhs.add(new Employee (2,"jlj"));
		lhs.add(new Employee(2,"jlj"));
		System.out.println(lhs);
		//treeset
		TreeSet<Employee>ts=new TreeSet<Employee>();
		ts.add(new Employee(3,"bbbb"));
		ts.add(new Employee(1,"cccc"));
		ts.add(new Employee(2,"dddd"));
		Iterator<Employee> itr1=ts.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}*/
	
	}

	

	
	

}
