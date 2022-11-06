package org.tnsindia.trial;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number =");
		int num1=obj.nextInt();
		
		System.out.println("Enter the second number =");
		int num2=obj.nextInt();
		
		int sum=num1+num2;
		System.out.println("sum of entered number is = "+ sum);
		
	}

}
