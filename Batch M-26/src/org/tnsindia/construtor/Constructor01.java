package org.tnsindia.construtor;

public class Constructor01 {
	
	String name;
	int phonenumber;
	char intialleter;

	public Constructor01(String name, int phonenumber, char intialleter) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.intialleter = intialleter;
	}

	public static void main(String[] args) 
	{
		Constructor01 t1 = new Constructor01("Rahul", 12345, 'r');
		Constructor01 t2 = new Constructor01("Vijay", 67890, 'v');
		Constructor01 t3 = new Constructor01("vaibhavi", 260322, 'v');
		
		System.out.println(t1.name+" "+t1.phonenumber+" "+t1.intialleter);
		System.out.println(t2.name+" "+t2.phonenumber+" "+t2.intialleter);
		System.out.println(t3.name+" "+t3.phonenumber+" "+t3.intialleter);
	}

}
