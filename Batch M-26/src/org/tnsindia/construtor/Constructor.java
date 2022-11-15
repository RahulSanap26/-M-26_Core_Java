package org.tnsindia.construtor;

public class Constructor {
	
	String name;
	int rollNo;
	
	//parameterized constructor 
	public Constructor(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) 
	{
		Constructor s1 = new Constructor("Rahul", 01);
		Constructor s2 = new Constructor("Vijay", 02); 
		
		System.out.println(s1.name+" "+s1.rollNo);
		System.out.println(s2.name+" "+s2.rollNo);

	}

}
