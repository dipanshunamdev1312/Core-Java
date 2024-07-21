package com.dsaByPrakashBabu;

import java.util.Scanner;

public class Check_even_or_odd {

	public static void main(String[] args) {
		
		System.out.print("Enter a number to check even or odd : ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
//		First way to solve by conditional statement
		
		
//		if(n%2 == 0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		
//		second way to solve by ternary operator
		System.out.println((n%2==0)?"Even Number":"Odd Number");
		
		sc.close();
	}

}
