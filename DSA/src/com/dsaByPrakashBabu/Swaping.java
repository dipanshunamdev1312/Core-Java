package com.dsaByPrakashBabu;

import java.util.Scanner;

public class Swaping {

	static void swaping(int a, int b) {
		
		System.out.println("Before swaping A and B : A = "+a+", B = "+b+":");
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swaping A and B : A = "+a+", B = "+b+":");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A value : ");
		int A = sc.nextInt();
		
		System.out.print("Enter B value : ");
		int B = sc.nextInt();
		
		swaping(A,B);
		
		sc.close();

	}

}
