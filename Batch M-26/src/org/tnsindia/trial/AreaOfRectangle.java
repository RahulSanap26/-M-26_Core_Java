package org.tnsindia.trial;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length: ");
		
		Scanner rect = new Scanner(System.in);
		double length = rect.nextDouble();
		
		System.out.println("Enter the width: ");
		double width = rect.nextDouble();
		
		double area = length*width;
		System.out.println("Area of rectangle = " +area);
	}

}
