package com.dsaByPrakashBabu;

import java.util.Scanner;

public class AdditionOfTwoNumber {

	public static void main(String[] args) {
		//read two numbers from input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for addition : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//use arithmetic operators to calculate the result.
		int c = a+b;
		
		// print the result
		System.out.println("Result : "+c);

	}

}
